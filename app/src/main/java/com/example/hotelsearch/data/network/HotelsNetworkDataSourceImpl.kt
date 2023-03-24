package com.example.hotelsearch.data.network

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.hotelsearch.data.network.request.HotelListRequest
import com.example.hotelsearch.data.network.response.detail.HotelDetailsResponse
import com.example.hotelsearch.data.network.response.search.HotelSearchResponse
import com.example.hotelsearch.internal.exceptions.NoConnectivityException

class HotelsNetworkDataSourceImpl(
    private val apiService: ApiService
) : HotelsNetworkDataSource {

    private val _downloadedHotelsList = MutableLiveData<HotelSearchResponse>()
    override val downloadedHotelsList: LiveData<HotelSearchResponse>
        get() = _downloadedHotelsList

    private val _downloadedHotelDetails = MutableLiveData<HotelDetailsResponse>()
    override val downloadedHotelDetails: LiveData<HotelDetailsResponse>
        get() = _downloadedHotelDetails

    override suspend fun fetchHotels(location: String) {
        try {
            val fetchedHotels = apiService
                .getLocationParam(location)
                .await()

            _downloadedHotelsList.postValue(fetchedHotels)
        } catch (e: NoConnectivityException) {
            Log.e("No Internet", e.message.toString())
        }
    }

    override suspend fun getDetails(request: HotelListRequest) {
        try {
            val fetchedDetails = apiService.getHotels(request).await()
            _downloadedHotelDetails.postValue(fetchedDetails)
        } catch (e: NoConnectivityException) {
            Log.e("No Internet", e.message.toString())
        }
    }
}