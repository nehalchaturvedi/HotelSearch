package com.example.hotelsearch.data.network.response.search


import com.google.gson.annotations.SerializedName

data class Country(
    val isoCode2: String,
    val isoCode3: String,
    val name: String
)