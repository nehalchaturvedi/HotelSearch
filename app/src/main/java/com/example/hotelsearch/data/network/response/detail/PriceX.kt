package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class PriceX(
    val accessibilityLabel: String,
    val formatted: String,
    @SerializedName("__typename")
    val typename: String
)