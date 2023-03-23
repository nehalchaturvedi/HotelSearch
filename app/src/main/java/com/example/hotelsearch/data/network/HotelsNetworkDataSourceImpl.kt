package com.example.hotelsearch.data.network

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.hotelsearch.internal.exceptions.NoConnectivityException
import com.example.hotelsearch.data.network.response.HotelListResponse

class HotelsNetworkDataSourceImpl(
    private val apiService: ApiService
) : HotelsNetworkDataSource {

    private val _downloadedHotelsList = MutableLiveData<HotelListResponse>()
    override val downloadedHotelsList: LiveData<HotelListResponse>
        get() = _downloadedHotelsList

    override suspend fun fetchHotels(location: String) {
        try {
            val fetchedHotels = apiService
                .getHotels(location)
                .await()

            _downloadedHotelsList.postValue(fetchedHotels)
        }
        catch (e : NoConnectivityException)
        {
            Log.e("No Internet", e.message.toString())
        }
    }
}