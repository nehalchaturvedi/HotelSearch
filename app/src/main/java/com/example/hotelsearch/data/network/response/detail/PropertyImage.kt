package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class PropertyImage(
    val alt: String,
    val fallbackImage: Any,
    val image: Image,
    val subjectId: Int,
    @SerializedName("__typename")
    val typename: String
)