package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class MapMarkerX(
    val label: String,
    val latLong: LatLong,
    @SerializedName("__typename")
    val typename: String
)