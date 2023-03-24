package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class PriceXX(
    val displayMessages: List<DisplayMessageX>,
    val lead: LeadX,
    val options: List<OptionX>,
    val priceMessages: List<PriceMessage>,
    val priceMessaging: Any,
    val strikeOut: StrikeOutXXX,
    val strikeOutType: String,
    @SerializedName("__typename")
    val typename: String
)