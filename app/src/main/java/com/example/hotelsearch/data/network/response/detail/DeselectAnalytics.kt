package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class DeselectAnalytics(
    val linkName: String,
    val referrerId: String,
    @SerializedName("__typename")
    val typename: String
)