package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class MessageX(
    val mark: Mark,
    val message: String,
    val theme: String,
    val type: String,
    @SerializedName("__typename")
    val typename: String
)