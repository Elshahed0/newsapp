package com.example.test1.presentation.di

import com.example.test1.data.repository.dataSource.NewsLocalDataSource
import com.example.test1.data.repository.dataSource.NewsRemoteDataSource
import com.example.test1.domain.repository.NewsRepository
import com.example.test1.domain.repository.NewsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideRepositoryModule(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ) : NewsRepository{
        return NewsRepositoryImpl(newsRemoteDataSource, newsLocalDataSource)

    }
}