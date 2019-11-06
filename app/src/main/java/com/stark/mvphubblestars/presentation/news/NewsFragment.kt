package com.stark.mvphubblestars.presentation.news

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.stark.mvphubblestars.R
import kotlinx.android.synthetic.main.fragment_news.view.*


class NewsFragment : MvpAppCompatFragment(), NewsView, AdapterView.OnItemSelectedListener {

    companion object {
        const val TAG = "NewsFragment"
        lateinit var recView: RecyclerView
//        var newsAdapter = NewsAdapter()
        fun newInstance(): NewsFragment {
            val fragment: NewsFragment = NewsFragment()
            val args: Bundle = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    @InjectPresenter
    lateinit var mNewsPresenter: NewsPresenter

    private lateinit var newsAdapter : NewsAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d("FRAGMENT", "News Fragment")
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        newsAdapter = NewsAdapter { mNewsPresenter.onItemClick(it) }
//        newsAdapter.setItemsClickListener { NewsItem ->
//            mNewsPresenter.onItemClick(NewsItem)
//        }

        recView = view.newsRecyclerView
        recView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = newsAdapter
        }

        mNewsPresenter.getData()
    }

    override fun setAdapterData(data: List<NewsItem>) {
        newsAdapter.setData(data)
    }

    override fun showMessage(error: String) {
        Toast.makeText(context, error, Toast.LENGTH_LONG).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {}

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {}

}