package com.bilal.dailypluse.di

import com.bilal.dailypluse.articles.ArticlesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {

//   factory { ArticlesViewModel(get()) }

   viewModel { ArticlesViewModel(get()) }
}