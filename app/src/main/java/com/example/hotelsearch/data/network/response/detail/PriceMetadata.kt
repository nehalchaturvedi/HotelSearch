package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class PriceMetadata(
    val discountType: String,
    val rateDiscount: RateDiscount,
    val totalDiscountPercentage: Int,
    @SerializedName("__typename")
    val typename: String
)