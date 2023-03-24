package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class ShoppingContext(
    val multiItem: Any,
    @SerializedName("__typename")
    val typename: String
)