package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class SearchCriteria(
    val resolvedDateRange: ResolvedDateRange,
    @SerializedName("__typename")
    val typename: String
)