package com.stark.mvphubblestars.Data.Net

import com.stark.mvphubblestars.domain.Dataclass.NewsModel
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface NewsApi {
    @GET("/api/v3/news")
    fun getAllNews(): Deferred<Response<List<NewsModel>>>
}