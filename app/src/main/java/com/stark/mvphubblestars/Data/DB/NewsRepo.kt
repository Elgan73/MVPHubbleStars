package com.stark.mvphubblestars.Data.DB

import com.stark.mvphubblestars.App
import com.stark.mvphubblestars.Data.DB.Entity.NewsEntity
import com.stark.mvphubblestars.domain.Dataclass.NewsModel
import com.stark.mvphubblestars.presentation.news.NewsItem

object NewsRepo {

    fun getAllNewsFromHubble(): List<NewsItem>? = App.newsDb?.newsDao()?.getAll()?.map {
        NewsItem(
            news_id = it.news_id,
            name = it.name,
            url = it.url
        )
    }

    fun getNewsById(id: String): List<NewsItem>? = App.newsDb?.newsDao()?.getOneby_id(id)?.map {
        NewsItem(
            news_id = it.news_id,
            name = it.name,
            url = it.url

        )
    }

    fun saveAllNews(data: List<NewsModel>) = App.newsDb?.newsDao()?.insertAll(data.map {
        NewsEntity(
            news_id = it.news_id,
            name = it.name,
            url = it.url
        )
    })

}