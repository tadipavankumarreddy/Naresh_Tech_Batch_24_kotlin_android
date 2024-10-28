package com.nareshtech.datastore

import android.content.Context
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.datastore.dataStore
import androidx.datastore.preferences.core.stringPreferencesKey
import com.nareshtech.datastore.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding:ActivityMainBinding
    val Context.dataStore:DataStore<Preferences> by preferencesDataStore(name = "settings")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        activityMainBinding.button.setOnClickListener {
            // Save data to datastore
            //TODO 1: get the key and value data from ui
            val key = activityMainBinding.preferencesKey.editText?.text.toString()
            val data = activityMainBinding.preferencesData.editText?.text.toString()

            // TODO 2: Create a data store in the coroutine's context and save the data
            CoroutineScope(Dispatchers.IO).launch {
                dataStore.edit {settings->
                    settings[stringPreferencesKey(key)] = data
                }
            }
        }

        activityMainBinding.button2.setOnClickListener {
            // load data from datastore
            //TODO 3: get the key and value data from ui
            val key = activityMainBinding.preferencesKey.editText?.text.toString()
            val preferences = dataStore.data.map {
                preferences->
                preferences[stringPreferencesKey(key)]?:"default value"
            }

            CoroutineScope(Dispatchers.IO).launch {
               val data = preferences.first()
                runOnUiThread{
                    activityMainBinding.textView.text = data
                }
            }
        }
    }
}