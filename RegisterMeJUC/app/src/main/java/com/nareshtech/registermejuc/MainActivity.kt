package com.nareshtech.registermejuc

import android.content.Context
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nareshtech.registermejuc.ui.theme.RegisterMeJUCTheme
import java.util.ArrayList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RegisterMeJUCTheme {
                registrationScreen()
            }
        }
    }

    @Composable
    @Preview
    private fun registrationScreen() {
        var name by remember { mutableStateOf("") }
        var age by remember { mutableStateOf("") }
        var gender by remember { mutableStateOf("") }
        var languages = listOf("Telugu", "Hindi", "Marati")
        val selectedLanguages = remember { mutableStateListOf<String>() }

        Column(modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
            .background(Color.White)
            .padding(WindowInsets.statusBars.asPaddingValues())
            .padding(WindowInsets.navigationBars.asPaddingValues())) {

            // name
            OutlinedTextField(value = name,
                onValueChange = {name = it},
                label = { Text(text = "Enter your name")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp))

            // age
            OutlinedTextField(value = age,
                onValueChange = {age = it},
                label = { Text(text = "Enter your age")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp))

            // gender
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround ) {
                Text(text = "Gender")

                RadioButton(selected = gender == "Male", onClick = { gender = "Male" })
                Text(text = "Male")

                RadioButton(selected = gender == "Female", onClick = { gender = "Female" })
                Text(text = "Female")
            }

            Text(text = "Languages", fontWeight = FontWeight.Bold)

            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround) {
                languages.forEach{language ->
                    Checkbox(checked = selectedLanguages.contains(language),
                        onCheckedChange = {
                            if (it) selectedLanguages.add(language) else selectedLanguages.remove(language)
                        })
                    Text(text = language, modifier = Modifier.weight(1f))
                }
            }
            Button(onClick = {
                val intent = Intent(applicationContext,DetailsActivity::class.java)
                    .putExtra("name", name)
                    .putExtra("age",age)
                    .putExtra("gender",gender)
                    .putStringArrayListExtra("languages", ArrayList(selectedLanguages))
                    .addFlags(FLAG_ACTIVITY_NEW_TASK)
                applicationContext.startActivity(intent)
            },
                modifier = Modifier.fillMaxWidth()) {
                Text(text = "Register")
            }
        }
    }
}