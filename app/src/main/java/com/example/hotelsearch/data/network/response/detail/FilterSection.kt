package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class FilterSection(
    val fields: List<Field>,
    val title: String,
    @SerializedName("__typename")
    val typename: String
)