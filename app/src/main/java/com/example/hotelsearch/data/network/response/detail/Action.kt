package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Action(
    val accessibility: Any,
    val actionType: String,
    val analytics: Analytics,
    @SerializedName("__typename")
    val typename: String
)