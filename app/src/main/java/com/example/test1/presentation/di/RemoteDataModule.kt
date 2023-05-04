package com.example.test1.presentation.di

import com.example.test1.data.api.NewsApiServices
import com.example.test1.data.repository.dataSorceImpl.NewsRemoteDataSourceImpl
import com.example.test1.data.repository.dataSource.NewsRemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RemoteDataModule {

    @Provides
    @Singleton
    fun provideRemoteDataModule(newsApiServices: NewsApiServices)
    : NewsRemoteDataSource{
        return NewsRemoteDataSourceImpl(newsApiServices)
    }
}