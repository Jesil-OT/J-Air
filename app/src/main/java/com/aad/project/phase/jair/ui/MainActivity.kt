package com.aad.project.phase.jair.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.aad.project.phase.jair.R
import com.aad.project.phase.jair.data.AirQualityIndexData
import dagger.hilt.android.AndroidEntryPoint
import java.util.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val p = AirQualityIndexData.getAirQualityIndexData()

        val ranInt =  Random().nextInt(10)

        val city =  p[ranInt].city
        val air =  p[ranInt].airQualityPercentage
        val listl =  p[ranInt].airQualityDetails

        Log.d("MainActivity", "onCreate: $city $air $listl")
    }
}