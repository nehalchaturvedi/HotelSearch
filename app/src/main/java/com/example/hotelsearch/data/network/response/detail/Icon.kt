package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Icon(
    val description: String,
    val id: String,
    val size: Any,
    val theme: Any,
    val token: String,
    @SerializedName("__typename")
    val typename: String
)