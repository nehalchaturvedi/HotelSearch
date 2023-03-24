package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Selected(
    val id: String,
    val max: Int,
    val min: Int,
    @SerializedName("__typename")
    val typename: String
)