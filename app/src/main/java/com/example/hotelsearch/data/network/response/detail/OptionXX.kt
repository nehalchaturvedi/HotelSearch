package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class OptionXX(
    val analytics: Analytics,
    val default: Boolean,
    val description: Any,
    val deselectAnalytics: DeselectAnalyticsX,
    val disabled: Boolean,
    val icon: Any,
    val id: String,
    val primary: String,
    val secondary: Any,
    val selectAnalytics: SelectAnalyticsX,
    val selected: Boolean,
    @SerializedName("__typename")
    val typename: String,
    val value: String
)