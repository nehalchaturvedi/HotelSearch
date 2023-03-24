package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class LineItem(
    val accessibilityLabel: Any,
    val badge: Any,
    val disclaimer: Disclaimer,
    val mark: Any,
    val price: PriceX,
    val role: String,
    val state: Any,
    @SerializedName("__typename")
    val typename: String,
    val value: String
)