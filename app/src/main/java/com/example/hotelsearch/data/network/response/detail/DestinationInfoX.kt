package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class DestinationInfoX(
    val distanceFromDestination: DistanceFromDestination,
    val distanceFromMessaging: String,
    val regionId: String,
    @SerializedName("__typename")
    val typename: String
)