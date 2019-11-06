package com.stark.mvphubblestars.presentation.news

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

@StateStrategyType(SkipStrategy::class)
interface NewsView: MvpView {
    fun setAdapterData(data: List<NewsItem>)
    fun showMessage(error: String)
}