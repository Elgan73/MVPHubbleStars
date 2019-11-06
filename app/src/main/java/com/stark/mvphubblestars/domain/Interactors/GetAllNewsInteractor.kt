package com.stark.mvphubblestars.domain.Interactors

import android.util.Log
import com.stark.mvphubblestars.App
import com.stark.mvphubblestars.presentation.news.NewsItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception


object GetAllNewsInteractor {
    fun execute(onComplete: (List<NewsItem>) -> Unit) {
        CoroutineScope(Dispatchers.IO).launch {
            val response = App.newsRepo.getAllNewsFromHubble()
            try {
                onComplete.invoke(response.orEmpty())
            } catch (e: Exception) {
                Log.e("Logs", "GetAllNewsInteractor exception: $e")
            }
        }
    }
}