package com.example.hotelsearch.data.network.response.search


import com.google.gson.annotations.SerializedName

data class HotelAddress(
    val city: String,
    val province: String,
    val street: String
)