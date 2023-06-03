package com.paparazziteam.linechartcurved

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.paparazziteam.linechartcurved.composables.LineChart
import com.paparazziteam.linechartcurved.composables.LineChartCurved
import com.paparazziteam.linechartcurved.composables.LineChartFullCurved
import com.paparazziteam.linechartcurved.ui.theme.LineChartCurvedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}


@Preview
@Composable
fun AllPoints() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        //preview of all charts
        LineChart(dataPoints = listOf(0.5f, 0.4f, 0.6f, 0.8f, 0.4f, 0.7f, 0.2f))
        LineChartCurved(dataPoints = listOf(0.5f, 0.4f, 0.6f, 0.8f, 0.4f, 0.7f, 0.2f))
        LineChartFullCurved(dataPoints = listOf(0.5f, 0.4f, 0.6f, 0.8f, 0.4f, 0.7f, 0.2f))
    }
}