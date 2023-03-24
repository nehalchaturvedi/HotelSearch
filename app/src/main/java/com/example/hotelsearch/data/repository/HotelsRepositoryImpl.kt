package com.example.hotelsearch.data.repository

import androidx.lifecycle.LiveData
import com.example.hotelsearch.data.network.HotelsNetworkDataSource
import com.example.hotelsearch.data.network.response.search.HotelSearchResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class HotelsRepositoryImpl(
    private val hotelsNetworkDataSource: HotelsNetworkDataSource
) : HotelsRepository {

    override suspend fun getHotels(location: String): LiveData<HotelSearchResponse> {
        return withContext(Dispatchers.IO) {
            hotelsNetworkDataSource.fetchHotels(location)
            return@withContext hotelsNetworkDataSource.downloadedHotelsList
        }

    }
}