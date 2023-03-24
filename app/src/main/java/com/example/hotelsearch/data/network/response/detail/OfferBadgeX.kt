package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class OfferBadgeX(
    val primary: PrimaryX,
    val secondary: SecondaryX,
    @SerializedName("__typename")
    val typename: String
)