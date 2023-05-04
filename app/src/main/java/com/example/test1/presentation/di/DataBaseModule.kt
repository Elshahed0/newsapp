package com.example.test1.presentation.di

import android.app.Application
import androidx.room.Room
import com.example.test1.data.db.ArticleDAO
import com.example.test1.data.db.ArticleDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule {


    @Singleton
    @Provides
    fun provideNewsDataBase(app: Application): ArticleDataBase {
        return Room.databaseBuilder(app, ArticleDataBase::class.java, "news_db")
            .fallbackToDestructiveMigration()
            .build()
    }


    @Singleton
    @Provides

    fun provideArticleDao(articleDataBase: ArticleDataBase): ArticleDAO {
        return articleDataBase.getArticleDAO()
    }

}
