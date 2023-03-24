package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class StrikeOut(
    val amount: Double,
    val formatted: String,
    @SerializedName("__typename")
    val typename: String
)