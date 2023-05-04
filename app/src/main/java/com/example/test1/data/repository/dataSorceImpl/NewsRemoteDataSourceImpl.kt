package com.example.test1.data.repository.dataSorceImpl

import com.example.test1.data.api.NewsApiServices
import com.example.test1.data.model.APIResponse
import com.example.test1.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsApiServices: NewsApiServices
    ) : NewsRemoteDataSource {
    override suspend fun getTopHeadlines( country: String,page: Int): Response<APIResponse> {
        return newsApiServices.getTopHeadlines(country, page)
    }

}