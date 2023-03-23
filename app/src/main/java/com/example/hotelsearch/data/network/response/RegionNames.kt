package com.example.hotelsearch.data.network.response


import com.google.gson.annotations.SerializedName

data class RegionNames(
    val displayName: String,
    val fullName: String,
    val lastSearchName: String,
    val primaryDisplayName: String,
    val secondaryDisplayName: String,
    val shortName: String
)