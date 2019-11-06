package com.stark.mvphubblestars.Data.DB.DAO

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.stark.mvphubblestars.Data.DB.Entity.NewsEntity
import com.stark.mvphubblestars.other.Constants

@Dao
interface NewsDao {
    @Query("SELECT * FROM ${Constants.TABLE_NAME}")
    fun getAll(): List<NewsEntity>

//    @Query("SELECT * FROM ${Constants.TABLE_NAME} WHERE liked = 1")
//    fun getLikedNews(): List<NewsEntity>

    @Insert
    fun insertAll(news: List<NewsEntity>)

//    @Query("DELETE FROM ${Constants.TABLE_NAME}")
//    fun nukeTable()

//    @Query("UPDATE ${Constants.TABLE_NAME} SET liked = :newStatus WHERE id_ = :id")
//    fun updateStatus(newStatus: Boolean, id: String)

    @Query("SELECT * FROM ${Constants.TABLE_NAME} WHERE news_id = :id")
    fun getOneby_id(id: String): List<NewsEntity>

}