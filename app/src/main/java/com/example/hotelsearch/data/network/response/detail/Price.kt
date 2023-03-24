package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Price(
    val displayMessages: List<DisplayMessage>,
    val lead: Lead,
    val options: List<Option>,
    val priceMessages: List<PriceMessage>,
    val priceMessaging: Any,
    val strikeOut: StrikeOutX,
    val strikeOutType: String,
    @SerializedName("__typename")
    val typename: String
)