package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Summary(
    val loyaltyInfo: LoyaltyInfo,
    val matchedPropertiesSize: Int,
    val pricingScheme: PricingScheme,
    val regionCompression: Any,
    val resultsSummary: List<ResultsSummary>,
    val resultsTitleModel: ResultsTitleModel,
    @SerializedName("__typename")
    val typename: String
)