package com.example.test1.domain.usecase

import com.example.test1.data.model.APIResponse
import com.example.test1.data.util.Resource
import com.example.test1.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(searchQuery: String): Resource<APIResponse> {
        return newsRepository.getSearchedNews(searchQuery)
    }

}