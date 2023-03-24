package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class PropertyImageX(
    val alt: String,
    val fallbackImage: Any,
    val image: ImageX,
    val subjectId: Int,
    @SerializedName("__typename")
    val typename: String
)