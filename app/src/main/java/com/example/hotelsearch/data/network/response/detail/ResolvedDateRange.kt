package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class ResolvedDateRange(
    val checkInDate: CheckInDate,
    val checkOutDate: CheckOutDate,
    @SerializedName("__typename")
    val typename: String
)