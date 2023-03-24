package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class DisplayMessage(
    val lineItems: List<LineItem>,
    @SerializedName("__typename")
    val typename: String
)