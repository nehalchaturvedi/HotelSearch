package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class TileMultiSelectionOption(
    val analytics: Analytics,
    val default: Boolean,
    val description: Any,
    val deselectAnalytics: DeselectAnalytics,
    val disabled: Boolean,
    val icon: Icon,
    val id: String,
    val primary: String,
    val secondary: String,
    val selectAnalytics: SelectAnalytics,
    val selected: Boolean,
    @SerializedName("__typename")
    val typename: String,
    val value: String
)