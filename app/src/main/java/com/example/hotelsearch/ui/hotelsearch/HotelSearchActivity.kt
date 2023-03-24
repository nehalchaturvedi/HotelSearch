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
import com.example.hotelsearch.databinding.ActivityMainBinding
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
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this, viewModelFactory).get(HotelSearchViewModel::class.java)
        bindUI()
    }

    private fun bindUI() = launch {
        val hotels = viewModel.hotellist
        hotels.await().observe(this@HotelSearchActivity, Observer {
            if (it == null) return@Observer
            Log.d("response", it.toString())
            binding.tvText.text = it.toString()
        })

    }
}