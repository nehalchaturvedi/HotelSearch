package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class DisplayMessageX(
    val lineItems: List<LineItemX>,
    @SerializedName("__typename")
    val typename: String
)