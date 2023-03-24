package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class ResultsSummary(
    val accessibilityLabel: String,
    val link: Link,
    @SerializedName("__typename")
    val typename: String,
    val value: String
)