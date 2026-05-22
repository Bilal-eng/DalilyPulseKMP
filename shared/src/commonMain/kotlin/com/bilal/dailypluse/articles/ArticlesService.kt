package com.bilal.dailypluse.articles

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class ArticlesService(
    private val httpClient: HttpClient
) {

    private val country = "us"
    private val category = "business"
    private val apiKey = "00aea416cd7145bb86d887aab4f9f944"

    suspend fun fetchArticles(): List<ArticleRaw> {
        val response: ArticlesResponse = httpClient
            .get("https://newsapi.org/v2/top-headlines?country=$country&category=$category&apiKey=$apiKey")
            .body()
        return response.articles
    }
}