package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class DistanceFromDestination(
    @SerializedName("__typename")
    val typename: String,
    val unit: String,
    val value: Double
)