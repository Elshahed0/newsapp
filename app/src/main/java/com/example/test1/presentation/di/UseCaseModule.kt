package com.example.test1.presentation.di

import com.example.test1.domain.repository.NewsRepository
import com.example.test1.domain.usecase.DeleteSavedNewsUseCase
import com.example.test1.domain.usecase.GetNewsHeadLinesUseCase
import com.example.test1.domain.usecase.GetSavedNewsUseCase
import com.example.test1.domain.usecase.SaveNewsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class  UseCaseModule {

    @Singleton
    @Provides
    fun provideUseCaseModule(
        newsRepository: NewsRepository
    ): GetNewsHeadLinesUseCase {
        return GetNewsHeadLinesUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun provideSAveNewsUseCase(
        newsRepository: NewsRepository
    ): SaveNewsUseCase {
        return SaveNewsUseCase(newsRepository)
    }


    @Singleton
    @Provides
    fun provideGetSavedNewsUseCase(
        newsRepository: NewsRepository
    ): GetSavedNewsUseCase {
        return GetSavedNewsUseCase(newsRepository)
    }


    @Singleton
    @Provides
    fun provideDeleteSavedNewsUseCase(
        newsRepository: NewsRepository
    ): DeleteSavedNewsUseCase {
        return DeleteSavedNewsUseCase(newsRepository)
    }
}


