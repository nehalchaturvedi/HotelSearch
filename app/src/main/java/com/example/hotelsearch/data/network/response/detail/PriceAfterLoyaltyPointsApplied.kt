package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class PriceAfterLoyaltyPointsApplied(
    val lead: Any,
    val options: List<Any>,
    @SerializedName("__typename")
    val typename: String
)