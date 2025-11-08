package com.example.prac_6_8

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.*
import com.example.prac_6_8.ui.theme.Prac_6_8Theme


@Composable
fun WaterTracker() {
    var waterCount by remember { mutableStateOf(0) }
    var consecutiveDays by remember { mutableStateOf(0) }
    val primaryColor = Color.LightGray
    val secondaryColor = Color.Blue
    val buttonTextColor = Color.Blue

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        Text(
            text = "Трекер воды",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = primaryColor
        )

        Spacer(modifier = Modifier.height(48.dp))

        Text(
            text = "$waterCount мл",
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            color = secondaryColor
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            colors = ButtonDefaults.buttonColors(primaryColor),
            onClick = { waterCount += 250 }
        ) {
            Text(
                text = "+250 мл",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = buttonTextColor
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                if (waterCount >= 1500) {
                    consecutiveDays++
                } else {
                    consecutiveDays = 0
                }
                waterCount = 0
            }
        ) {
            Text(
                text = "Завершить день",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = buttonTextColor
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Дни подряд: $consecutiveDays",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = primaryColor
        )
    }
}