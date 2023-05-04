package com.example.test1.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.test1.data.model.Article


@Database(
    entities = [Article::class], // list of entities
    version = 1,
    exportSchema = false
)@TypeConverters(Converters::class) // to convert source to string and vice versa
abstract class ArticleDataBase :RoomDatabase( ){
    abstract fun getArticleDAO(): ArticleDAO // to access DAO

}