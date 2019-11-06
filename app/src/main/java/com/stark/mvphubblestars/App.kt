package com.stark.mvphubblestars

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.stark.mvphubblestars.Data.DB.NewsDB
import com.stark.mvphubblestars.Data.DB.NewsRepo
import com.stark.mvphubblestars.Data.Net.NewsNetworkService
import com.stark.mvphubblestars.other.Navigation.Router

class App: Application() {

    companion object {
        @SuppressLint ("StaticFieldLeak")
        var context : Context? = null
        var newsNetworkService = NewsNetworkService()
        var fragmentRouter = Router()
        var newsDb : NewsDB? = null
        var newsRepo = NewsRepo
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        newsDb = NewsDB.getInstanse(context!!)
    }
}