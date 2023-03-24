package com.example.hotelsearch.data.network

import androidx.lifecycle.LiveData
import com.example.hotelsearch.data.network.response.search.HotelListResponse

interface HotelsNetworkDataSource {

    val downloadedHotelsList: LiveData<HotelListResponse>

    suspend fun fetchHotels(
        location: String
    )
}