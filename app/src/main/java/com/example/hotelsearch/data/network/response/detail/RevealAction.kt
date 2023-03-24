package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class RevealAction(
    val accessibility: String,
    val action: Action,
    val badge: Int,
    val disabled: Boolean,
    val icon: Icon,
    val primary: String,
    @SerializedName("__typename")
    val typename: String
)