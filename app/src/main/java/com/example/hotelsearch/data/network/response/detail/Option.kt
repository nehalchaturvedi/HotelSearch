package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Option(
    val disclaimer: DisclaimerX,
    val formattedDisplayPrice: String,
    val strikeOut: StrikeOut,
    @SerializedName("__typename")
    val typename: String
)