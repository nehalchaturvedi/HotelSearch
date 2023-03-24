package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class CurrencyInfo(
    val code: String,
    val symbol: String,
    @SerializedName("__typename")
    val typename: String
)