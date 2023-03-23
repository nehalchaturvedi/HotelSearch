package com.example.hotelsearch.ui.hotelsearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.example.hotelsearch.R
import com.example.hotelsearch.data.network.ApiService
import com.example.hotelsearch.data.network.interceptors.ConnectivityInterceptorImpl
import com.example.hotelsearch.data.network.HotelsNetworkDataSourceImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HotelSearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apisrevice = ApiService(ConnectivityInterceptorImpl(this.applicationContext))
        val hotelsNetworkDataSourceImpl = HotelsNetworkDataSourceImpl(apisrevice)

        hotelsNetworkDataSourceImpl.downloadedHotelsList.observe(this, Observer {
            Log.d("response", it.toString())
        })

        GlobalScope.launch(Dispatchers.Main) {
            hotelsNetworkDataSourceImpl.fetchHotels("New york")
        }
    }
}