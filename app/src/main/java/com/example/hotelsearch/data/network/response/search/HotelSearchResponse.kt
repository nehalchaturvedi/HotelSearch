package com.example.hotelsearch.data.network.response.search


import com.google.gson.annotations.SerializedName

//Find hotel search response
data class HotelSearchResponse(
    val q: String,
    val rc: String,
    val rid: String,
    @SerializedName("sr")
    val hotelList: List<Hotel>
)