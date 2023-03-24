package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class Field(
    val action: Action,
    val analytics: Analytics,
    val expando: Expando,
    val icon: Icon,
    val id: String,
    val label: Any,
    val multiSelectionOptions: List<MultiSelectionOption>,
    val options: List<OptionXX>,
    val placeholder: String,
    val primary: String,
    val range: Range,
    val secondary: Any,
    val selected: Any,
    val tileMultiSelectionOptions: List<TileMultiSelectionOption>,
    val typeaheadInfo: TypeaheadInfo,
    @SerializedName("__typename")
    val typename: String
)