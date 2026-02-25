package com.aulasandroid.enemygame

import android.R.attr.text
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
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
    Row(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
            horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(

            text = "SCORE: 0050",
            color = Color.White,
        )

        Text(
            text = "LIVES:",
            color = Color.White,

        )
        Enemy(
            modifier = Modifier
                .background(Color.LightGray)
                .size(25.dp),
            color = Color.Green,

        )
        Enemy(
            modifier = Modifier
                .size(25.dp),
            color = Color.Green
        )
        Enemy(
            modifier = Modifier
                .size(25.dp),
            color = Color.Green
        )


    }
    Row (
        modifier = Modifier

            .fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically

    ) {

        Enemy(
            modifier = Modifier
                .size(100.dp),
            color = Color.Yellow,
        )
        Enemy(
            modifier = Modifier
                .size(100.dp),
            color = Color.Red,
        )
        Enemy(
            modifier = Modifier
                .size(100.dp),
            color = Color.Blue,
        )
        Enemy(
            modifier = Modifier
                .size(100.dp),
            color = Color.Yellow,
            )
        Enemy(
            modifier = Modifier
                .size(100.dp),
            color = Color.Green, )

    }


}

@Composable
fun Enemy(modifier: Modifier = Modifier, color: Color) {
    Image(
        contentDescription = "Enemy",
        painter = painterResource(R.drawable.ic_launcher_foreground),
        modifier = modifier,
        colorFilter = ColorFilter.tint(color)
    )
}