package com.example.test1.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.test1.data.model.Article
import kotlinx.coroutines.flow.Flow


@Dao    // Data Access Object
interface ArticleDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(article: Article){
        // insert article into database

    }

    @Query("SELECT * FROM articles")
    fun getAllArticles(): Flow<List<Article>> // to get all articles from database


    @Delete
    suspend fun delete(article: Article){
        // delete article from database
    }

}