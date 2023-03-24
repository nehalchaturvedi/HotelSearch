package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class DropdownFilterOption(
    val analytics: Analytics,
    val default: Boolean,
    val description: Any,
    val deselectAnalytics: DeselectAnalyticsXXX,
    val disabled: Boolean,
    val icon: Any,
    val id: String,
    val primary: String,
    val secondary: Any,
    val selectAnalytics: SelectAnalyticsXXX,
    val selected: Boolean,
    @SerializedName("__typename")
    val typename: String,
    val value: String
)