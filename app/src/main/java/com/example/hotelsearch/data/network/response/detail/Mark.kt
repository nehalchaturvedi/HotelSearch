package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Mark(
    val description: String,
    val id: String,
    val token: String,
    @SerializedName("__typename")
    val typename: String
)