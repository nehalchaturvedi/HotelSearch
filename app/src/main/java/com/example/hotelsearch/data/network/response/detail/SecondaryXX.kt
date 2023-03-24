package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class SecondaryXX(
    val action: ActionXXXX,
    val disabled: Boolean,
    val primary: String,
    @SerializedName("__typename")
    val typename: String
)