package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class StrikeOutXXX(
    val amount: Double,
    val currencyInfo: CurrencyInfoXXX,
    val formatted: String,
    @SerializedName("__typename")
    val typename: String
)