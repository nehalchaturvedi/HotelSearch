package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Link(
    val clientSideAnalytics: ClientSideAnalytics,
    @SerializedName("__typename")
    val typename: String,
    val uri: Uri
)