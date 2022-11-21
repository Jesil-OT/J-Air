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

        airQualityIndexData.add(AirQualityIndexModel(
            "Niger, NG",
            10,
            listOf(
                AirQualityIndexDetails(
                    "Air quality is bad",
                    null
                ),
                AirQualityIndexDetails(
                    "Recommendations",
                    "Air pollution is can harm your health at this point," +
                            " please leave this area"
                )
            )
        ))

        airQualityIndexData.add(AirQualityIndexModel(
            "Bayelsa, NG",
            65,
            listOf(
                AirQualityIndexDetails(
                    "Air quality is Good",
                    null
                ),
                AirQualityIndexDetails(
                    "Recommendations",
                    "Air pollution is little, please put on a face mask or handkerchief"
                )
            )
        ))

        airQualityIndexData.add(AirQualityIndexModel(
            "Edo benin, NG",
            99,
            listOf(
                AirQualityIndexDetails(
                    "Air quality is Excellent",
                    null
                ),
                AirQualityIndexDetails(
                    "Recommendations",
                    "Air pollution is of no harm"
                )
            )
        ))

        airQualityIndexData.add(AirQualityIndexModel(
            "Anambra, NG",
            25,
            listOf(
                AirQualityIndexDetails(
                    "Air quality is poor",
                    null
                ),
                AirQualityIndexDetails(
                    "Recommendations",
                    "Air pollution is could cause risk to the health, please leave this area"
                )
            )
        ))

        airQualityIndexData.add(AirQualityIndexModel(
            "Abuja, NG",
            85,
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

        airQualityIndexData.add(AirQualityIndexModel(
            "Abia, NG",
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