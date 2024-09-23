package com.nareshit.retrofit_kotlin

import com.nareshit.retrofit_kotlin.modelclasses.FakeGet
import com.nareshit.retrofit_kotlin.modelclasses.PostRequest
import com.nareshit.retrofit_kotlin.modelclasses.PostResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface JsonTypicodeInterface {
    @GET("posts/1")
    fun getData():Call<FakeGet>

    @POST("posts")
    fun postData(@Body postRequest: PostRequest):Call<PostResponse>
}