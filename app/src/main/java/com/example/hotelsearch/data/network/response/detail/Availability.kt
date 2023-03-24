package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Availability(
    val available: Boolean,
    val minRoomsLeft: Int,
    @SerializedName("__typename")
    val typename: String
)