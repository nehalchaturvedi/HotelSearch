package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class SortSection(
    val fields: List<FieldX>,
    val title: Any,
    @SerializedName("__typename")
    val typename: String
)