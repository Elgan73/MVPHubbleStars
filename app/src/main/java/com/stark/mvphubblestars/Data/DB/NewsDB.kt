package com.stark.mvphubblestars.Data.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.stark.mvphubblestars.Data.DB.DAO.NewsDao
import com.stark.mvphubblestars.Data.DB.Entity.NewsEntity
import com.stark.mvphubblestars.other.Constants


@Database(entities = [NewsEntity::class], version = 1, exportSchema = false)
abstract class NewsDB: RoomDatabase() {
    abstract fun newsDao(): NewsDao

    companion object {
        private var INSTANSE : NewsDB? = null

        fun getInstanse(context: Context): NewsDB? {
            if(INSTANSE == null) {
                synchronized(NewsDB::class) {
                    INSTANSE = Room.databaseBuilder(
                        context,
                        NewsDB::class.java, Constants.TABLE_NAME
                    ).fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANSE
        }
    }

}