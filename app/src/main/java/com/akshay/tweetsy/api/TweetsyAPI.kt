package com.akshay.tweetsy.api

import com.akshay.tweetsy.models.TweetListItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsyAPI {

    @GET("/v3/b/668cedb4e41b4d34e40f40b2?meta=false")
    @Headers("X-Bin-Meta: false")
    suspend fun getTweets(
        @Header("X-JSON-Path") category: String
    ): Response<List<TweetListItem>>

    @GET("/v3/b/668cedb4e41b4d34e40f40b2?meta=false")
    @Headers("X-JSON-Path: tweets..category")
    suspend fun getCategories(): Response<List<String>>

}