package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Attribute(
    val type: String,
    @SerializedName("__typename")
    val typename: String
)