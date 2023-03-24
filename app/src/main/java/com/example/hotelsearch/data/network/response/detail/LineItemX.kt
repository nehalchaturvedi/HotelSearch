package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class LineItemX(
    val accessibilityLabel: Any,
    val badge: Any,
    val disclaimer: Disclaimer,
    val mark: Any,
    val price: Price,
    val role: String,
    val state: Any,
    @SerializedName("__typename")
    val typename: String,
    val value: String
)