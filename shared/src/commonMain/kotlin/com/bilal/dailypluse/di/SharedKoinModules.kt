package com.bilal.dailypluse.di

import com.bilal.dailypluse.articles.di.articlesModule

val sharedKoinModules = listOf(
    articlesModule,
    networkModule
)