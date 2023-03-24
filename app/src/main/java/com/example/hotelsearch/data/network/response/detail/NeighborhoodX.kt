package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class NeighborhoodX(
    val name: String,
    @SerializedName("__typename")
    val typename: String
)