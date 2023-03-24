package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class PriceMessage(
    @SerializedName("__typename")
    val typename: String,
    val value: String
)