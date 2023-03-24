package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class PropertySearchListings(
    val availability: Availability,
    val destinationInfo: DestinationInfoX,
    val featuredMessages: List<Any>,
    val id: String,
    val legalDisclaimer: Any,
    val listingFooter: Any,
    val mapMarker: MapMarkerX,
    val name: String,
    val neighborhood: Neighborhood,
    val offerBadge: OfferBadgeX,
    val offerSummary: OfferSummaryX,
    val pinnedDetails: Any,
    val price: PriceXX,
    val priceAfterLoyaltyPointsApplied: PriceAfterLoyaltyPointsApplied,
    val priceMetadata: PriceMetadataX,
    val propertyFees: List<PropertyFee>,
    val propertyImage: PropertyImageX,
    val regionId: String,
    val reviews: Reviews,
    val saveTripItem: Any,
    val sponsoredListing: Any,
    val star: Any,
    val supportingMessages: Any,
    @SerializedName("__typename")
    val typename: String
)