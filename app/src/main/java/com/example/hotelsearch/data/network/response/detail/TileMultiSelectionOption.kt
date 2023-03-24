package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class TileMultiSelectionOption(
    val analytics: Analytics,
    val default: Boolean,
    val description: Any,
    val deselectAnalytics: DeselectAnalyticsXX,
    val disabled: Boolean,
    val icon: IconX,
    val id: String,
    val primary: String,
    val secondary: String,
    val selectAnalytics: SelectAnalyticsXX,
    val selected: Boolean,
    @SerializedName("__typename")
    val typename: String,
    val value: String
)