package com.example.hotelsearch.data.network

import androidx.lifecycle.LiveData
import com.example.hotelsearch.data.network.request.HotelListRequest
import com.example.hotelsearch.data.network.response.detail.HotelDetailsResponse
import com.example.hotelsearch.data.network.response.search.HotelSearchResponse

//Exposes livedata for downloaded list and downloaded hotel lists.
interface HotelsNetworkDataSource {

    val downloadedHotelsList: LiveData<HotelSearchResponse>
    val downloadedHotelDetails: LiveData<HotelDetailsResponse>

    suspend fun fetchHotels(
        location: String
    )
    suspend fun getDetails(
        request: HotelListRequest
    )
}