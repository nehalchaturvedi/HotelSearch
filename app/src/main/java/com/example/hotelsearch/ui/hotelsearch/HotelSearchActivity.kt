package com.example.hotelsearch.ui.hotelsearch

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hotelsearch.data.network.response.detail.Property
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
        bindUI()
    }

    private fun bindUI() {
        //Setup adapter
        adapter = HotelsAdapter(HotelsAdapter.OnClickListener { hotel ->
            var intent = Intent(this, HotelDetailsActivity::class.java)
            intent.putExtra("name", hotel.name ?: "")
            intent.putExtra("score", hotel.reviews.score ?: 0)
            intent.putExtra("price", hotel.price?.options?.get(0)?.formattedDisplayPrice)
            intent.putExtra("offer", hotel?.offerBadge?.primary?.text)
            intent.putExtra("image", hotel.propertyImage.image.url ?: "")
            startActivity(intent)
        })
        binding.mRecyclerView.adapter = adapter
        binding.mRecyclerView.layoutManager = LinearLayoutManager(this)

        //Setup on click listener for search
        binding.ivSearch.setOnClickListener {
            getHotelLocation()
        }
        binding.etSearch.setOnEditorActionListener { textView, actionId, keyEvent ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                //First API called to get locationID from the search prompt
                getHotelLocation()
            }
            return@setOnEditorActionListener true
        }

        //Hotel list details fetched once locationId is updated.
        locationId.observe(this, Observer {
            fetchHotelDetails()
        })
    }

    fun getHotelLocation() {
        val searchText = binding.etSearch.text.toString()
        if (searchText.isEmpty()) {
            Toast.makeText(this, "Please enter a valid location", Toast.LENGTH_LONG).show()
        } else {
            fetchHotelLocation(searchText)
        }
    }

    private fun fetchHotelLocation(searchText: String) = launch {
        binding.progressBar.visibility = View.VISIBLE
        val hotels = viewModel.getList(searchText)
        hotels.await().observe(this@HotelSearchActivity, Observer {
            if (it == null) return@Observer
            //locationID updated here, which triggers fetchHotelDetails()
            locationId.postValue(getLocationId(it))
        })
    }

    private fun fetchHotelDetails() = launch {
        if (locationId.value.isNullOrBlank()) {
            Toast.makeText(this@HotelSearchActivity, "City Not found", Toast.LENGTH_LONG).show()
            adapter.hotels = listOf<Property>()
            adapter.notifyDataSetChanged()
            binding.progressBar.visibility = View.GONE
            binding.tvCityName.text = ""
            return@launch
        }

        val hotelDetails = viewModel.getHotelDetails(locationId.value!!)
        //List of hotels extracted, and handed to custom adapter to display.
        hotelDetails.await().observe(this@HotelSearchActivity, Observer {
            binding.progressBar.visibility = View.GONE
            if (it == null) return@Observer
            val response = it
            adapter.hotels = response.data.propertySearch.properties
            adapter.notifyDataSetChanged()
        })
    }

    //Extract location ID from response of list
    private fun getLocationId(response: HotelSearchResponse): String {
        try {
            for (h in response.hotelList) {
                if (h.type == "gaiaRegionResult") {
                    binding.tvCityName.text =
                        String.format(
                            "Showing results around - %s",
                            h.regionNames.displayName ?: ""
                        )
                    return h.gaiaId
                }
            }
        } catch (e: java.lang.Exception) {
            Log.e("NoCityFoundException", e.printStackTrace().toString())
        }
        return ""
    }
}