package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Disclaimer(
    val content: List<String>,
    val title: Any,
    @SerializedName("__typename")
    val typename: String
)