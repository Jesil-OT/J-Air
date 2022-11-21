package com.aad.project.phase.jair.repo

import com.aad.project.phase.jair.data.AirQualityIndexData
import com.aad.project.phase.jair.data.model.AirQualityIndexModel
import javax.inject.Inject

class AirQualityIndexRepo @Inject constructor(
    private val data : AirQualityIndexData
) {

    fun getAirQualityIndexData(): ArrayList<AirQualityIndexModel> =
         data.getAirQualityIndexData()

}