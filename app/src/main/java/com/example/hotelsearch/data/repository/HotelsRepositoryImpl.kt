package com.example.hotelsearch.data.repository

import androidx.lifecycle.LiveData
import com.example.hotelsearch.data.network.HotelsNetworkDataSource
import com.example.hotelsearch.data.network.response.HotelListResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class HotelsRepositoryImpl(
    private val hotelsNetworkDataSource: HotelsNetworkDataSource
) : HotelsRepository {

    init {
        hotelsNetworkDataSource.downloadedHotelsList.observeForever { newHotelList ->
            //persist
        }
    }

    override suspend fun getHotels(location: String): LiveData<HotelListResponse> {
        return withContext(Dispatchers.IO) {
            hotelsNetworkDataSource.fetchHotels(location)
            return@withContext hotelsNetworkDataSource.downloadedHotelsList
        }

    }
}