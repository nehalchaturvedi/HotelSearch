package com.example.hotelsearch.data.network.response


import com.google.gson.annotations.SerializedName

data class HotelListResponse(
    val q: String,
    val rc: String,
    val rid: String,
    @SerializedName("sr")
    val hotelList: List<Hotel>
)