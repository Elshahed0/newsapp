package com.example.test1.domain.usecase

import com.example.test1.data.model.Article
import com.example.test1.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {

    fun execute(): Flow<List<Article>> {
        return newsRepository.getSavedNews()

    }


}