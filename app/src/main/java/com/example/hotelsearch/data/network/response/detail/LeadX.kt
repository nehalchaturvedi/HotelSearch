package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class LeadX(
    val amount: Double,
    val currencyInfo: CurrencyInfo,
    val formatted: String,
    @SerializedName("__typename")
    val typename: String
)