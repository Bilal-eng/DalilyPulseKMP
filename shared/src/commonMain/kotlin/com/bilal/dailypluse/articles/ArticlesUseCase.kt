package com.bilal.dailypluse.articles

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.daysUntil
import kotlinx.datetime.toLocalDateTime
import kotlinx.datetime.todayIn
import kotlin.math.abs

private const val DEFAULT_IMAGE =
    "https://image.cnbcfm.com/api/v1/image/107326078-1698758530118-gettyimages-1765623456-wall26362_igj6ehhp.jpeg?v=1698758587&w=1920&h=1080"

class ArticlesUseCase(private val service: ArticlesService) {

    suspend operator fun invoke(): List<Article> =
        service.fetchArticles().map {
            it.toArticle()
        }


    private fun ArticleRaw.toArticle(): Article {
        return Article(
            title = title,
            desc = desc ?: "Click to find out more",
            date = getDaysAgoString(date),
            imageUrl = imageUrl
                ?: DEFAULT_IMAGE
        )
    }

    private fun getDaysAgoString(date: String): String {
        val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
        val days = today.daysUntil(
            Instant.parse(date).toLocalDateTime(TimeZone.currentSystemDefault()).date
        )

        return when {
            abs(days) > 1 -> "${abs(days)} days ago"
            abs(days) == 1 -> "Yesterday"
            else -> "Today"
        }
    }
}