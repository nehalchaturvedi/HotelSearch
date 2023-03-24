package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class LineItemX(
    val accessibilityLabel: Any,
    val badge: Any,
    val disclaimer: DisclaimerXX,
    val mark: Any,
    val price: PriceXXX,
    val role: String,
    val state: Any,
    @SerializedName("__typename")
    val typename: String,
    val value: String
)