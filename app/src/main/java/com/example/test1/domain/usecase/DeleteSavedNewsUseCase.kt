package com.example.test1.domain.usecase

import com.example.test1.data.model.Article
import com.example.test1.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(article: Article) {
        newsRepository.deleteNews(article)
    }
}