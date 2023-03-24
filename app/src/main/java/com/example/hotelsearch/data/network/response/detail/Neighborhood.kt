package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Neighborhood(
    val name: String,
    val regionId: String,
    @SerializedName("__typename")
    val typename: String
)