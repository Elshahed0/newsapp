package com.example.test1.presentation.di

import com.example.test1.data.db.ArticleDAO
import com.example.test1.data.repository.dataSorceImpl.NewsLocalDataSourceImpl
import com.example.test1.data.repository.dataSource.NewsLocalDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {

    @Singleton
    @Provides
    fun provideLocalDataModule(articleDAO: ArticleDAO): NewsLocalDataSource {
        return NewsLocalDataSourceImpl(articleDAO)
    }


}