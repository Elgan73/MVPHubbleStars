package com.stark.mvphubblestars.presentation.news

import android.os.Bundle
import android.util.Log
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.stark.mvphubblestars.App
import com.stark.mvphubblestars.domain.Interactors.GetAllNewsInteractor
import com.stark.mvphubblestars.domain.Interactors.LoadNewsInteractor
import com.stark.mvphubblestars.other.Constants
import com.stark.mvphubblestars.other.Navigation.Screens
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

@InjectViewState
class NewsPresenter : MvpPresenter<NewsView>() {
    private fun loadNews() {
        LoadNewsInteractor.execute {
            App.newsRepo.saveAllNews(it)
            getData()
        }
    }

    fun getData() {
        GetAllNewsInteractor.execute {
            if(it.isEmpty()) {
                Log.d("News", "$it")
                loadNews()
            } else {
                Log.d("News", "$it")
                setData(it)
            }
        }
    }

    private fun setData(data: List<NewsItem>) {
        CoroutineScope(Dispatchers.Main).launch {
             viewState.setAdapterData(data)
        }
    }

    fun onItemClick(newsItem: NewsItem) {
        try {
            val bundle = Bundle()
            bundle.putString(Constants.DETAILS_BUNDLE_KEY_ID, newsItem.news_id)
            App.fragmentRouter.replace(Screens.FRAGMENTS.DETAILS_FRAGMENT, bundle)
            Log.d("Bundle", "$newsItem")
        } catch (e: Exception) {
            Log.d("Exception", "$e")
        }
    }


}