package com.nareshit.retrofit_kotlin

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nareshit.retrofit_kotlin.modelclasses.FakeGet
import com.nareshit.retrofit_kotlin.modelclasses.PostRequest
import com.nareshit.retrofit_kotlin.modelclasses.PostResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    var jsonTypicodeInterface:JsonTypicodeInterface? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize retorift object
        val retrofit:Retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        // Initialize the interface
        jsonTypicodeInterface = retrofit.create(JsonTypicodeInterface::class.java)
    }

    fun getRequest(view: View) {
        jsonTypicodeInterface?.getData()?.enqueue(object : Callback<FakeGet>{
            override fun onResponse(p0: Call<FakeGet>, p1: Response<FakeGet>) {
                Log.v("MAIN", p1.body().toString())
            }

            override fun onFailure(p0: Call<FakeGet>, p1: Throwable) {

            }
        })
    }

    fun postRequest(view: View) {
        jsonTypicodeInterface?.postData(PostRequest("Pavan","Trainer",12))?.
        enqueue(object : Callback<PostResponse> {
            override fun onResponse(p0: Call<PostResponse>, p1: Response<PostResponse>) {
                Log.v("MAIN",p1.body().toString())
            }

            override fun onFailure(p0: Call<PostResponse>, p1: Throwable) {

            }
        })
    }
}