package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class TypeaheadInfo(
    val client: String,
    val isDestination: Boolean,
    val lineOfBusiness: String,
    val maxNumberOfResults: Int,
    val packageType: Any,
    val personalize: Boolean,
    val regionType: Int,
    val typeaheadFeatures: String,
    @SerializedName("__typename")
    val typename: String
)