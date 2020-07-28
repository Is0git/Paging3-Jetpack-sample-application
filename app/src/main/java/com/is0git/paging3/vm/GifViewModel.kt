package com.is0git.paging3.vm

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.is0git.paging3.GifRepository

class GifViewModel @ViewModelInject constructor(var repo: GifRepository, @Assisted var savedStateHandle: SavedStateHandle) : ViewModel() {

    val pagedDataFlow = Pager(
        PagingConfig(10)
    ) {
        repo.networkOnlyPageSource
    }.flow
        .cachedIn(viewModelScope)
}