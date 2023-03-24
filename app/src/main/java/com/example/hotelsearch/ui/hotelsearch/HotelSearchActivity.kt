package com.example.hotelsearch.ui.hotelsearch

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hotelsearch.data.network.response.search.HotelSearchResponse
import com.example.hotelsearch.databinding.ActivityMainBinding
import com.example.hotelsearch.ui.base.ScopedActivity
import com.example.hotelsearch.ui.hoteldetails.HotelDetailsActivity
import kotlinx.coroutines.launch
import org.kodein.di.KodeinAware
import org.kodein.di.android.closestKodein
import org.kodein.di.generic.instance

class HotelSearchActivity : ScopedActivity(), KodeinAware {

    override val kodein by closestKodein()
    private val viewModelFactory: HotelSearchViewModelFactory by instance()
    private lateinit var viewModel: HotelSearchViewModel
    lateinit var binding: ActivityMainBinding
    var locationId = MutableLiveData<String>()
    lateinit var adapter: HotelsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this, viewModelFactory).get(HotelSearchViewModel::class.java)
        attachListeners()
    }

    private fun attachListeners() {
        adapter = HotelsAdapter(HotelsAdapter.OnClickListener { hotel ->
            var intent = Intent(this, HotelDetailsActivity::class.java)
            intent.putExtra("name", hotel.name)
            intent.putExtra("score", hotel.reviews.score)
            intent.putExtra("price", hotel.price?.options?.get(0)?.formattedDisplayPrice)
            intent.putExtra("offer", hotel?.offerBadge?.primary?.text)
            startActivity(intent)
        })
        binding.mRecyclerView.adapter = adapter
        binding.mRecyclerView.layoutManager = LinearLayoutManager(this)

        binding.ivSearch.setOnClickListener {
            val searchText = binding.etSearch.text.toString()
            if (searchText.isEmpty()) {
                Toast.makeText(this, "Please enter a valid location", Toast.LENGTH_LONG)
            } else {
                fetchHotelLocation(searchText)
            }
        }
        locationId.observe(this, Observer {
            fetchHotelDetails()
        })
    }

    private fun fetchHotelLocation(searchText: String) = launch {
        binding.progressBar.visibility = View.VISIBLE
        val hotels = viewModel.getList(searchText)
        hotels.await().observe(this@HotelSearchActivity, Observer {
            if (it == null) return@Observer
            locationId.postValue(getLocationId(it))
        })
    }

    private fun fetchHotelDetails() = launch {
        val hotelDetails = viewModel.getHotelDetails(locationId.value!!)
        hotelDetails.await().observe(this@HotelSearchActivity, Observer {
            binding.progressBar.visibility = View.GONE
            if (it == null) return@Observer
            //Log.d("response", it.toString())
            val response = it
            adapter.hotels = response.data.propertySearch.properties
            Log.d("response", response.toString())
        })
    }

    private fun getLocationId(response: HotelSearchResponse): String {
        try {
            for (h in response.hotelList) {
                if (h.type.equals("CITY")) {
                    return h.gaiaId
                }
            }
        } catch (e: java.lang.Exception) {
            Log.e("error", "city not found")
        }
        return "2622"
    }
}