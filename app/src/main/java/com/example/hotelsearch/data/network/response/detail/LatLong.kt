package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class LatLong(
    val latitude: Double,
    val longitude: Double,
    @SerializedName("__typename")
    val typename: String
)