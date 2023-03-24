package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Actions(
    val primary: PrimaryXX,
    val secondaries: List<SecondaryXX>,
    @SerializedName("__typename")
    val typename: String
)