package com.bilal.dailypluse.articles

import com.bilal.dailypluse.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ArticlesViewModel : BaseViewModel() {

    private val _articlesState: MutableStateFlow<ArticlesState> = MutableStateFlow(ArticlesState())

    val articlesState: StateFlow<ArticlesState> = _articlesState

    init {
        getArticles()
    }

    private fun getArticles() {
        scope.launch {
            delay(500)
            _articlesState.emit(ArticlesState())
        }
    }

}