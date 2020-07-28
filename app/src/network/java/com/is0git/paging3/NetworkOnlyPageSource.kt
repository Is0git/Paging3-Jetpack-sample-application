package com.is0git.paging3

import androidx.paging.PagingSource
import com.is0git.paging3.network.models.GfycatsItem
import com.is0git.paging3.network.services.GifService
import java.lang.Exception
import javax.inject.Inject

class NetworkOnlyPageSource @Inject constructor(private val gifService: GifService) :
    PagingSource<String, GfycatsItem>() {
    override suspend fun load(params: LoadParams<String>): LoadResult<String, GfycatsItem> {
        return try {
            val responseResult = gifService.getFeedGifList("trending", params.key, params.loadSize)
            when {
                responseResult.isSuccessful && responseResult.body() != null -> {
                    LoadResult.Page(
                        responseResult.body()!!.gfycats,
                        null,
                        responseResult.body()!!.cursor
                    )
                }
                else -> {
                    LoadResult.Error(Throwable(responseResult.message()))
                }
            }
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}