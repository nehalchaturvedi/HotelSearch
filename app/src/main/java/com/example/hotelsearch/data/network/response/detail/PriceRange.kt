package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class PriceRange(
    val max: Double,
    val min: Int,
    @SerializedName("__typename")
    val typename: String
)