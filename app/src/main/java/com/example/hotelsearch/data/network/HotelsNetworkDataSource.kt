package com.example.hotelsearch.data.network

import androidx.lifecycle.LiveData
import com.example.hotelsearch.data.network.response.search.HotelSearchResponse

interface HotelsNetworkDataSource {

    val downloadedHotelsList: LiveData<HotelSearchResponse>

    suspend fun fetchHotels(
        location: String
    )
}