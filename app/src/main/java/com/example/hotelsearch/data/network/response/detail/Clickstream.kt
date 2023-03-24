package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Clickstream(
    val searchResultsViewed: Any,
    @SerializedName("__typename")
    val typename: String
)