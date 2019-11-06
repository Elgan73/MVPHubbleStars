package com.stark.mvphubblestars.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.stark.mvphubblestars.App
import com.stark.mvphubblestars.R

class MainActivity : MvpAppCompatActivity(), MainView {

    companion object {
        const val TAG = "MainActivity"
        fun getIntent(context: Context) : Intent = Intent(context, MainActivity::class.java)
    }

    @InjectPresenter
    lateinit var mMainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMainPresenter.onStart(supportFragmentManager, R.id.fragment_container, ::finishActivity)
    }

    override fun onBackPressed() {
        App.fragmentRouter.back()
    }

    private fun finishActivity() {
        finish()
    }
}
