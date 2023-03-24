package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Image(
    val description: String,
    @SerializedName("__typename")
    val typename: String,
    val url: String
)