package com.example.hotelsearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.example.hotelsearch.network.ApiService
import com.example.hotelsearch.network.ConnectivityInterceptorImpl
import com.example.hotelsearch.network.HotelsNetworkDataSourceImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
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