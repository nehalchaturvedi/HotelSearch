package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class OptionX(
    val disclaimer: DisclaimerXXX,
    val formattedDisplayPrice: String,
    val strikeOut: StrikeOutXX,
    @SerializedName("__typename")
    val typename: String
)