package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Expando(
    val collapseAnalytics: CollapseAnalytics,
    val collapseLabel: String,
    val expandAnalytics: ExpandAnalytics,
    val expandLabel: String,
    val threshold: Int,
    @SerializedName("__typename")
    val typename: String
)