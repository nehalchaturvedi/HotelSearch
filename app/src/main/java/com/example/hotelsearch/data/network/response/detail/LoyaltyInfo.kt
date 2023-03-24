package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class LoyaltyInfo(
    val saveWithPointsActionMessage: Any,
    val saveWithPointsMessage: Any,
    @SerializedName("__typename")
    val typename: String
)