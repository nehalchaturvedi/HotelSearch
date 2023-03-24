package com.example.hotelsearch.data.network.request


import com.google.gson.annotations.SerializedName

data class CheckOutDate(
    val day: Int,
    val month: Int,
    val year: Int
)