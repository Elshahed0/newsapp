package com.example.test1.data.repository.dataSource

import com.example.test1.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(
        country: String,
        page: Int
    ): Response<APIResponse>

}
