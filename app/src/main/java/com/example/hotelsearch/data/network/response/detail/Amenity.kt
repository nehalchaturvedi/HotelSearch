package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Amenity(
    val id: Int,
    @SerializedName("__typename")
    val typename: String
)