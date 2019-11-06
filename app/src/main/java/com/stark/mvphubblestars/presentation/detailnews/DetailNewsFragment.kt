package com.stark.mvphubblestars.presentation.detailnews

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatFragment

class DetailNewsFragment: MvpAppCompatFragment(), DetailNewsView {
    companion object {
        const val TAG = "DetailsFragment"
        fun newInstance(bundle: Bundle?): DetailNewsFragment {
            val fragment = DetailNewsFragment()
            val args: Bundle = bundle ?: Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}