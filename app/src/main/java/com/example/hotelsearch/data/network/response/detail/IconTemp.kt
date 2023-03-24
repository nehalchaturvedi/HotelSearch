package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class IconTemp(
    val description: String,
    val id: String,
    @SerializedName("__typename")
    val typename: String
)