package com.bilal.dailypluse.articles.di

import com.bilal.dailypluse.articles.ArticlesService
import com.bilal.dailypluse.articles.ArticlesUseCase
import com.bilal.dailypluse.articles.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {

    single { ArticlesService(get()) }
    single { ArticlesUseCase(get()) }
    single { ArticlesViewModel() }
}