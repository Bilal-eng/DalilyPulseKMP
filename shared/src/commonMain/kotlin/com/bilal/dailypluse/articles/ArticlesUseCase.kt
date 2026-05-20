package com.bilal.dailypluse.articles

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
            date = date,
            imageUrl = imageUrl
                ?: DEFAULT_IMAGE
        )
    }
}