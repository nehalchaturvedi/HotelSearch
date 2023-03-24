package com.example.hotelsearch.ui.hotelsearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.hotelsearch.R
import com.example.hotelsearch.data.network.ApiService
import com.example.hotelsearch.data.network.interceptors.ConnectivityInterceptorImpl
import com.example.hotelsearch.data.network.HotelsNetworkDataSourceImpl
import com.example.hotelsearch.ui.base.ScopedActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.closestKodein
import org.kodein.di.generic.instance

class HotelSearchActivity : ScopedActivity(), KodeinAware {

    override val kodein by closestKodein()
    private val viewModelFactory: HotelSearchViewModelFactory by instance()
    private lateinit var viewModel: HotelSearchViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this, viewModelFactory).get(HotelSearchViewModel::class.java)
        bindUI()
//        val apisrevice = ApiService(ConnectivityInterceptorImpl(this.applicationContext))
//        val hotelsNetworkDataSourceImpl = HotelsNetworkDataSourceImpl(apisrevice)
//
//        hotelsNetworkDataSourceImpl.downloadedHotelsList.observe(this, Observer {
//            Log.d("response", it.toString())
//        })
//
//        GlobalScope.launch(Dispatchers.Main) {
//            hotelsNetworkDataSourceImpl.fetchHotels("New york")
//        }
    }

    private fun bindUI() = launch {
        val hotels = viewModel.hotellist
        hotels.await().observe(this@HotelSearchActivity, Observer {
            if (it == null) return@Observer
            Log.d("response", it.toString())
        })

    }
}