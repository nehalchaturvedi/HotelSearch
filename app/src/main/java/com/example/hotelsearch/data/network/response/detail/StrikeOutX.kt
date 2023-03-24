package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class StrikeOutX(
    val amount: Double,
    val currencyInfo: CurrencyInfoX,
    val formatted: String,
    @SerializedName("__typename")
    val typename: String
)