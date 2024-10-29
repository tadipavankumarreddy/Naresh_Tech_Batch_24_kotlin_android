package com.nareshtech.scoretrackerjuc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nareshtech.scoretrackerjuc.ui.theme.ScoreTrackerJUCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScoreTrackerJUCTheme {
                generateScreen()
            }
        }
    }

    @Composable
    @Preview
    fun generateScreen(){
        var count by remember { mutableStateOf(0) }
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(WindowInsets.statusBars.asPaddingValues())
            .padding(20.dp)) {
            Button(onClick = { count++ },
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)) {
                Text(text = "+", fontSize = 20.sp)
            }

            Box(modifier = Modifier.weight(8f)
                .background(Color.Yellow)
                .padding(16.dp),
                contentAlignment = Alignment.Center){

                Text(text = count.toString(),
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 100.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )

            }

            Button(onClick = { count-- },
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)) {
                Text(text = "-", fontSize = 20.sp)
            }
        }
    }
}
