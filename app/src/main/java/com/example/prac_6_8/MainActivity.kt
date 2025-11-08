package com.example.prac_6_8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prac_6_8.ui.theme.Prac_6_8Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prac_6_8Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //Preview_StretchedPurpleCircleOnBlue()
                    //PreviewUserProfile()
                    WaterTracker()
                }
            }
        }
    }
}

@Composable
fun ProfileCard(name: String, patronymic: String, surname: String, phone: String, address: String, imageRes: Painter) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.LightGray)
            .border(0.dp, Color.Gray),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Имя: $name", style = TextStyle(fontSize = 14.sp))
            Text(text = "Отчество: $patronymic", style = TextStyle(fontSize = 14.sp))
            Text(text = "Фамилия: $surname", style = TextStyle(fontSize = 14.sp))
            Text(text = "Мобильный телефон: $phone", style = TextStyle(fontSize = 14.sp))
            Text(text = "Адрес: $address", style = TextStyle(fontSize = 14.sp))
        }

        Image(
            painter = painterResource(R.drawable.circle),
            contentDescription = null,
            modifier = Modifier
                .wrapContentSize()
        )
    }
}

@Composable
fun UserProfile() {
    val name = "Евгений"
    val patronymic = "Андреевич"
    val surname = "Лукашин"
    val phone = "+7 495 495 95 95"
    val address = "г. Москва, 3-я улица Строителей, д. 25, кв. 12"
    val imageRes = painterResource(id = R.drawable.circle)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        ProfileCard(name, patronymic, surname, phone, address, imageRes)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewUserProfile() {
    UserProfile()
}

/*
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
fun Preview_StretchedPurpleCircleOnBlue() = StretchedPurpleCircleOnBlue()*/
