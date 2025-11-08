package com.example.prac_6_8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prac_6_8.ui.theme.Prac_6_8Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prac_6_8Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Preview_StretchedPurpleCircleOnBlue()
                }
            }
        }
    }
}

@Composable
fun CircleTopRightOnBlack() {
    Box(
        modifier = Modifier
            .size(width = 240.dp, height = 120.dp)
            .background(Color.Black)
    ) {
        Image(
            painter = painterResource(R.drawable.circle),
            contentDescription = null,
            modifier = Modifier
                .wrapContentSize()
                .align(Alignment.TopEnd)
        )
    }
}


@Composable
fun StretchedPurpleCircleOnBlue() {
    Box(
        modifier = Modifier
            .size(width = 240.dp, height = 120.dp)
            .background(Color(0xFF2196F3))
    ) {
        Image(
            painter = painterResource(R.drawable.circle),
            contentDescription = null,
            modifier = Modifier
                .size(width = 320.dp, height = 120.dp),
            contentScale = ContentScale.FillBounds,
            colorFilter = ColorFilter.tint(Color(0xFF8A2BE2))
        )
    }
}

@Preview
@Composable
fun Preview_CircleTopRightOnBlack() = CircleTopRightOnBlack()

@Preview
@Composable
fun Preview_StretchedPurpleCircleOnBlue() = StretchedPurpleCircleOnBlue()