package com.paparazziteam.linechartcurved.composables

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LineChart(
    dataPoints : List<Float>
) {

    //create canvas
    Canvas(modifier = Modifier
        .fillMaxWidth()
        .height(200.dp)){
        //create path, here will be saved all the points
        val linePath = androidx.compose.ui.graphics.Path()
        val xStep = size.width / (dataPoints.size - 1)
        val yStep = size.height / (dataPoints.maxOrNull() ?: 1f)

        //iterate all the points - dataPoints
        dataPoints.forEachIndexed { index, dataPoint ->
            val xPos = index * xStep
            val yPos = size.height - (dataPoint * yStep)

            if(index == 0)
            {
                linePath.moveTo(xPos, yPos)
            }else{
                linePath.lineTo(xPos, yPos)
            }
        }

        //draw the path
        drawPath(
            path = linePath,
            color = androidx.compose.ui.graphics.Color.Blue,
            style = Stroke(width = 2.dp.toPx())
        )

    }

}

@Preview
@Composable
fun LineChartPrev() {
    LineChart(dataPoints = listOf(0.5f, 0.4f, 0.6f, 0.8f, 0.4f, 0.7f, 0.2f))
}