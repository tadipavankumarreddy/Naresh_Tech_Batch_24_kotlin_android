package com.nareshtech.registermejuc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nareshtech.registermejuc.ui.theme.RegisterMeJUCTheme

class DetailsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RegisterMeJUCTheme {
                Column(
                    modifier = Modifier
                        .padding(WindowInsets.statusBars.asPaddingValues())
                        .padding(WindowInsets.navigationBars.asPaddingValues())
                        .padding(16.dp)
                ) {
                    Text(text = intent.getStringExtra("name") ?: "", fontWeight = FontWeight.Bold)
                    Text(text = intent.getStringExtra("age") ?: "", fontWeight = FontWeight.Bold)
                    Text(text = (intent.getStringArrayListExtra("languages") ?: arrayListOf<String>()).joinToString(","))
                }
            }
        }
    }
}
