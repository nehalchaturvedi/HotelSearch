package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class ApplyAction(
    val accessibility: String,
    val action: Action,
    val badge: Any,
    val disabled: Boolean,
    val icon: Any,
    val primary: String,
    @SerializedName("__typename")
    val typename: String
)