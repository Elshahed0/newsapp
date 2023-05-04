package com.example.test1.data.repository.dataSorceImpl

import com.example.test1.data.db.ArticleDAO
import com.example.test1.data.model.Article
import com.example.test1.data.repository.dataSource.NewsLocalDataSource
import kotlinx.coroutines.flow.Flow

class NewsLocalDataSourceImpl(
    private val articleDAO: ArticleDAO
): NewsLocalDataSource {
    override suspend fun saveArticleToDB(article: Article) {

        articleDAO.insert(article)

    }

    override fun getSavedArticles(): Flow<List<Article>> {

            return articleDAO.getAllArticles()
    }

    override suspend fun deleteArticleFromDB(article: Article) {

            articleDAO.delete(article)
    }
}