package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Range(
    val analytics: Analytics,
    val characteristics: Characteristics,
    val icon: Any,
    val id: String,
    val primary: String,
    val secondary: Any,
    val selected: Selected,
    @SerializedName("__typename")
    val typename: String
)