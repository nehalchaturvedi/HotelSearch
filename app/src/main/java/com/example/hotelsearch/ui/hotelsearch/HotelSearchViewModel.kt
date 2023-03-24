package com.example.hotelsearch.ui.hotelsearch

import androidx.lifecycle.ViewModel
import com.example.hotelsearch.data.network.request.*
import com.example.hotelsearch.data.repository.HotelsRepository
import com.example.hotelsearch.internal.lazyDeferred
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class HotelSearchViewModel(
    private val hotelsRepository: HotelsRepository
) : ViewModel() {


//    val hotellist by lazyDeferred {
//        hotelsRepository.getHotels("new york")
//    }

    fun getList(location: String) = GlobalScope.async(start = CoroutineStart.LAZY) {
        hotelsRepository.getHotels(location)
    }

    fun getHotelDetails(regionId: String) = GlobalScope.async(start = CoroutineStart.LAZY) {
        val room = Room(2, listOf(Children(5), Children(7)))
        val request = HotelListRequest(
            CheckInDate(12, 6, 2023),
            CheckOutDate(14, 6, 2023),
            "USD",
            Destination(regionId),
            1,
            "en_US",
            200,
            0,
            listOf(room),
            300000001,
            "PRICE_LOW_TO_HIGH"
        )
        hotelsRepository.getHotelDetails(request)
    }

//    val hoteldetails by lazyDeferred {
//        val room = Room(2, listOf(Children(5), Children(7)))
//        val request = HotelListRequest(
//            CheckInDate(12, 6, 2023),
//            CheckOutDate(14, 6, 2023),
//            "USD",
//            Destination("2621"),
//            1,
//            "en_US",
//            200,
//            0,
//            listOf(room),
//            300000001,
//            "PRICE_LOW_TO_HIGH"
//        )
//        hotelsRepository.getHotelDetails(request)
//    }


}