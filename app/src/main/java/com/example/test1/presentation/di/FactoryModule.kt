package com.example.test1.presentation.di

import android.app.Application
import com.example.test1.domain.usecase.DeleteSavedNewsUseCase
import com.example.test1.domain.usecase.GetNewsHeadLinesUseCase
import com.example.test1.domain.usecase.GetSavedNewsUseCase
import com.example.test1.domain.usecase.SaveNewsUseCase
import com.example.test1.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

class FactoryModule {

    @Singleton
    @Provides
    fun provideNewsViewModelFactory(
        application: Application,
        getNewsHeadLinesUseCase: GetNewsHeadLinesUseCase,
        saveNewsUseCase: SaveNewsUseCase,
        getSavedNewsUseCase: GetSavedNewsUseCase,
        deleteSavedNewsUseCase: DeleteSavedNewsUseCase
    ): NewsViewModelFactory {
        return NewsViewModelFactory(
            application,
            getNewsHeadLinesUseCase,
            saveNewsUseCase,
            getSavedNewsUseCase,
            deleteSavedNewsUseCase
        )

    }
}