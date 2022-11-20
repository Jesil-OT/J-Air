package com.aad.project.phase.jair.data

import com.aad.project.phase.jair.data.model.AirQualityIndexDetails
import com.aad.project.phase.jair.data.model.AirQualityIndexModel

/**
 * This data class holds all the Air Quality
 * data to be displayed in the UI
 * */

object AirQualityIndexData {

    private val airQualityIndexData = ArrayList<AirQualityIndexModel>()

    fun getAirQualityIndexData(): ArrayList<AirQualityIndexModel> {
        airQualityIndexData.add(AirQualityIndexModel(
            "seattle, WA",
            45,
            listOf(
                AirQualityIndexDetails(
                    "Air quality is satisfactory",
                    null
                ),
                AirQualityIndexDetails(
                    "Recommendations",
                    "Air pollution poses little or no risk"
                )
            )
        ))

        airQualityIndexData.add(AirQualityIndexModel(
            "Port Harcourt, NG",
            25,
            listOf(
                AirQualityIndexDetails(
                    "Air quality is Poor",
                    null
                ),
                AirQualityIndexDetails(
                    "Recommendations",
                    "Air pollution poses to hurt your health"
                )
            )
        ))

        airQualityIndexData.add(AirQualityIndexModel(
            "Borokiri Port harcourt, NG",
            10,
            listOf(
                AirQualityIndexDetails(
                    "Air quality is very Poor",
                    null
                ),
                AirQualityIndexDetails(
                    "Recommendations",
                    "Air pollution can cause serious damage to the health system"
                )
            )
        ))

        airQualityIndexData.add(AirQualityIndexModel(
            "Sokoto, NG",
            70,
            listOf(
                AirQualityIndexDetails(
                    "Air quality is Good",
                    null
                ),
                AirQualityIndexDetails(
                    "Recommendations",
                    "Air pollution is little, it's has no serious harm to health"
                )
            )
        ))










        return airQualityIndexData

    }


}