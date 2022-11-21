package com.aad.project.phase.jair.data.model

/**
 * This data holds the Air Quality
 * */

data class AirQualityIndexModel(
    val city: String = "",
    val airQualityPercentage : Int = 0,
    val airQualityDetails : List<AirQualityIndexDetails>
)