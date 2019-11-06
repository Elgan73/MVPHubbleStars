package com.stark.mvphubblestars.other.Navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.stark.mvphubblestars.presentation.detailnews.DetailNewsFragment
import com.stark.mvphubblestars.presentation.news.NewsFragment

object Screens {
    private val newsFragment = NewsFragment()

    enum class FRAGMENTS(fragmentName: String) {
        NEWS_FRAGMENT("NEWS FRAGMENT"),
        DETAILS_FRAGMENT("DETAILS FRAGMENT")
    }

    fun createFragment(fragment: FRAGMENTS, bundle: Bundle? = null): Fragment = when (fragment) {
        Screens.FRAGMENTS.NEWS_FRAGMENT -> newsFragment
        Screens.FRAGMENTS.DETAILS_FRAGMENT -> DetailNewsFragment.newInstance(bundle)
    }
}