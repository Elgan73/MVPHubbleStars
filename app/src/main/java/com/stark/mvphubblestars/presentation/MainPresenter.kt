package com.stark.mvphubblestars.presentation

import androidx.fragment.app.FragmentManager
import com.arellomobile.mvp.MvpPresenter
import com.stark.mvphubblestars.App
import com.stark.mvphubblestars.other.Navigation.Screens

class MainPresenter : MvpPresenter<MainView>() {

    fun onStart(supportFragmentManager: FragmentManager, fragment_container: Int, finishActivity: () -> Unit) {
        App.fragmentRouter.initRouter(supportFragmentManager, fragment_container, finishActivity)
        App.fragmentRouter.navigateTo(Screens.FRAGMENTS.NEWS_FRAGMENT)
    }
}
