package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class OfferSummary(
    val attributes: List<Attribute>,
    val messages: List<Message>,
    @SerializedName("__typename")
    val typename: String
)