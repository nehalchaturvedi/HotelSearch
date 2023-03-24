package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class OfferSummaryX(
    val attributes: List<AttributeX>,
    val messages: List<MessageX>,
    @SerializedName("__typename")
    val typename: String
)