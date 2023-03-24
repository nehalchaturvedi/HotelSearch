package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class CheckOutDate(
    val day: Int,
    val month: Int,
    @SerializedName("__typename")
    val typename: String,
    val year: Int
)