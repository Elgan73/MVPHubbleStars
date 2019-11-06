package com.stark.mvphubblestars.domain.Interactors

import android.util.Log
import com.stark.mvphubblestars.App
import com.stark.mvphubblestars.presentation.news.NewsItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

object GetNewsByIdInteractor {
    fun execute(id: String, onComplite: (NewsItem) -> Unit) {

        CoroutineScope(Dispatchers.IO).launch {
            val response = App.newsRepo.getNewsById(id)
            try {
                onComplite.invoke(response!![0])
            } catch (e: Exception) {
                Log.d("Logs", "GetNewsByIdInteractor exception: $e")
            }
        }
    }
}