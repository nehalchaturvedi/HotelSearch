package com.example.hotelsearch.data.repository

import androidx.lifecycle.LiveData
import com.example.hotelsearch.data.network.request.HotelListRequest
import com.example.hotelsearch.data.network.response.detail.HotelDetailsResponse
import com.example.hotelsearch.data.network.response.search.HotelSearchResponse

interface HotelsRepository {
    suspend fun getHotels(location: String): LiveData<HotelSearchResponse>

    suspend fun getHotelDetails(request: HotelListRequest): LiveData<HotelDetailsResponse>
}

