package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class ResultsTitleModel(
    val header: String,
    @SerializedName("__typename")
    val typename: String
)