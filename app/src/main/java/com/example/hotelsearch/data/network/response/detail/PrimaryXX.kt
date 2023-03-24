package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class PrimaryXX(
    val action: Action,
    val primary: Any,
    @SerializedName("__typename")
    val typename: String
)