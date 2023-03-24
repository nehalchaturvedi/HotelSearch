package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class OfferBadge(
    val primary: Primary,
    val secondary: Secondary,
    @SerializedName("__typename")
    val typename: String
)