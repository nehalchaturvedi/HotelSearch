package com.example.hotelsearch.data.repository

import androidx.lifecycle.LiveData
import com.example.hotelsearch.data.network.response.HotelListResponse

interface HotelsRepository {
    suspend fun getHotels(location: String): LiveData<HotelListResponse>
}

