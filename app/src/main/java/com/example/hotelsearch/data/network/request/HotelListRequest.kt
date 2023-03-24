package com.example.hotelsearch.data.network.request


import com.google.gson.annotations.SerializedName
import java.lang.reflect.Constructor

data class HotelListRequest(
    val checkInDate: CheckInDate,
    val checkOutDate: CheckOutDate,
    val currency: String,
    val destination: Destination,
    val eapid: Int,
    //val filters: Filters,
    val locale: String,
    val resultsSize: Int,
    val resultsStartingIndex: Int,
    val rooms: List<Room>,
    val siteId: Int,
    val sort: String
)