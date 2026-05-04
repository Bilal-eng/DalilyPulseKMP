package com.bilal.dailypluse.articles

import com.bilal.dailypluse.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ArticlesViewModel : BaseViewModel() {

    private val _articlesState: MutableStateFlow<ArticlesState> = MutableStateFlow(ArticlesState())

    val articlesState: StateFlow<ArticlesState> = _articlesState

}