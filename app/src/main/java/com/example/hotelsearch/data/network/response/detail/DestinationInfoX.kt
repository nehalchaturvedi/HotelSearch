package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class DestinationInfoX(
    val distanceFromDestination: DistanceFromDestinationX,
    val distanceFromMessaging: String,
    val regionId: String,
    @SerializedName("__typename")
    val typename: String
)