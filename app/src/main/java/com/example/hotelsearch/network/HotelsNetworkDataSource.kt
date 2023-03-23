package com.example.hotelsearch.network

import androidx.lifecycle.LiveData
import com.example.hotelsearch.network.response.HotelListResponse

interface HotelsNetworkDataSource {

    val downloadedHotelsList : LiveData<HotelListResponse>

    suspend fun fetchHotels(
        location : String
    )
}