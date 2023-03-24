package com.example.hotelsearch.data.network.response.detail


import com.google.gson.annotations.SerializedName

data class PropertySearchListings(
    val availability: AvailabilityX,
    val destinationInfo: DestinationInfoX,
    val featuredMessages: List<Any>,
    val id: String,
    val legalDisclaimer: Any,
    val listingFooter: Any,
    val mapMarker: MapMarkerX,
    val name: String,
    val neighborhood: NeighborhoodXX,
    val offerBadge: OfferBadgeX,
    val offerSummary: OfferSummaryX,
    val pinnedDetails: Any,
    val price: PriceXX,
    val priceAfterLoyaltyPointsApplied: PriceAfterLoyaltyPointsAppliedX,
    val priceMetadata: PriceMetadataX,
    val propertyFees: List<PropertyFeeX>,
    val propertyImage: PropertyImageX,
    val regionId: String,
    val reviews: ReviewsX,
    val saveTripItem: Any,
    val sponsoredListing: Any,
    val star: Any,
    val supportingMessages: Any,
    @SerializedName("__typename")
    val typename: String
)