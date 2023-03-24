package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class MapMarker(
    val label: String,
    val latLong: LatLong,
    @SerializedName("__typename")
    val typename: String
)