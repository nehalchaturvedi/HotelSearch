package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Characteristics(
    val labels: List<Label>,
    val max: Int,
    val min: Int,
    val step: Int,
    @SerializedName("__typename")
    val typename: String
)