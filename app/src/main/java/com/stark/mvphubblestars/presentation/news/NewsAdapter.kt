package com.stark.mvphubblestars.presentation.news

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.stark.mvphubblestars.R

class NewsAdapter(private val itemClickListener: (NewsItem) -> Unit) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    private var newsList = mutableListOf<NewsItem>()
//    private var itemClickListener: ((NewsItem) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)) {
            itemClickListener.invoke(it)

        }
    }

    override fun getItemCount() = newsList.size

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val item = newsList[position]
        holder.bind(item)
    }

    fun setData(items: List<NewsItem>) {
        this.newsList.clear()
        this.newsList.addAll(items)
        notifyDataSetChanged()
    }

//    fun setItemsClickListener(itemClickListener: ((NewsItem) -> Unit)?) {
//        this.itemClickListener = itemClickListener
//    }

    inner class NewsViewHolder(view: View, private val itemClickListener: (NewsItem) -> Unit) :
        RecyclerView.ViewHolder(view) {
        //        private var itemNews = view.findViewById<View>(R.id.item_news_аааа)
//        private val newsLabel = view.findViewById<TextView>(R.id.newsLabel)

        private val newsText = view.findViewById<TextView>(R.id.textView)
        fun bind(item: NewsItem) {
            newsText.text = item.name
            Log.d("ffffffff", "$item")
            newsText.setOnClickListener { itemClickListener.invoke(item) }
        }

//        init{
//            itemNews.setOnClickListener {
//                itemClickListener?.invoke(newsList[adapterPosition])
//            }
//        }
    }
}
