package com.stark.mvphubblestars.domain.Interactors

import android.util.Log
import com.stark.mvphubblestars.App
import com.stark.mvphubblestars.domain.Dataclass.NewsModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

object LoadNewsInteractor {
    fun execute(onComplete: ((List<NewsModel>) -> Unit)?) {

        CoroutineScope(Dispatchers.IO).launch {
            Log.d("Logs", "before start")
            val response = App.newsNetworkService.newsApi.getAllNews().await()
            Log.d("Logs", "response: $response")

            try {
                onComplete?.invoke(response.body().orEmpty())
            } catch (e: Exception) {
                Log.d("Logs", "interactor Exception: $e")
            }
        }
    }
}