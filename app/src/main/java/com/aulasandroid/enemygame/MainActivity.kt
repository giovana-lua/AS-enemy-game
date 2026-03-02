package com.aulasandroid.enemygame

import android.R.attr.fontFamily
import android.R.attr.fontWeight
import android.R.attr.text
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.enemygame.ui.theme.EnemyGameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EnemyGameTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                   TelaPrincipal(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun TelaPrincipal(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {

        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(

                text = "SCORE: 0050",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )


            Row() {

                Text(
                    text = "LIVES:",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                    )
                Enemy(
                    modifier = Modifier
                        .size(16.dp)
                        .align(Alignment.CenterVertically),

                    color = Color.Green,

                    )
                Enemy(
                    modifier = Modifier
                        .size(16.dp)
                        .align(Alignment.CenterVertically),
                    color = Color.Green
                )
                Enemy(
                    modifier = Modifier
                        .size(16.dp)
                        .align(Alignment.CenterVertically),
                    color = Color.Green
                )
            }
        }

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.9f)
            ) {

            Enemy(
                modifier = Modifier
                    .size(80.dp),
                color = Color.Yellow,
            )
            Enemy(
                modifier = Modifier
                    .size(80.dp),
                color = Color.Red,
            )
            Enemy(
                modifier = Modifier
                    .size(80.dp),
                color = Color.Blue,
            )
            Enemy(
                modifier = Modifier
                    .size(80.dp),
                color = Color.Yellow,
            )
            Enemy(
                modifier = Modifier
                    .size(80.dp),
                color = Color.Green, )
        }

        Row() {
            Box(modifier = Modifier
                .size(30.dp),
                color = Color.Green
            )
        }



        Row( modifier = Modifier
            .fillMaxWidth()
            .background(Color(0x76FFFFFF))
            .padding(18.dp),
            horizontalArrangement = Arrangement.Center

        )
        {


            Text(

                text = "Press Start".uppercase(),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,





            )
        }
    }





}

@Composable
fun Enemy(modifier: Modifier = Modifier, color: Color) {
    Image(
        contentDescription = "Enemy",
        painter = painterResource(R.drawable.outline_android_24),
        modifier = modifier,
        colorFilter = ColorFilter.tint(color)
    )
}

@Composable
fun Box (modifier: Modifier = Modifier, color: Color) {
    Image(
        contentDescription = "box",
        painter = painterResource(R.drawable.outline_box_24),
        modifier = modifier,
        colorFilter = ColorFilter.tint(color)
    )

}