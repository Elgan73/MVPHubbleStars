package com.stark.mvphubblestars.Data.Net

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class NewsNetworkService {
    private fun retrofit() = Retrofit.Builder()
        .baseUrl("https://hubblesite.org")
        .addConverterFactory(MoshiConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()

    val newsApi : NewsApi = retrofit().create(NewsApi::class.java)
}