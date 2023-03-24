package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Toolbar(
    val actions: Actions,
    val primary: String,
    @SerializedName("__typename")
    val typename: String
)