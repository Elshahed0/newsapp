package com.example.test1.domain.usecase

import com.example.test1.data.model.APIResponse
import com.example.test1.data.util.Resource
import com.example.test1.domain.repository.NewsRepository

class GetNewsHeadLinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(
        country: String,
        page: Int
    ): Resource<APIResponse> {
        return newsRepository.getNewsHeadLines(country, page)
    }
}