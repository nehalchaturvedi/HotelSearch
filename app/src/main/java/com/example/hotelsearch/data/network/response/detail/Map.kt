package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Map(
    val subtitle: Any,
    @SerializedName("__typename")
    val typename: String
)