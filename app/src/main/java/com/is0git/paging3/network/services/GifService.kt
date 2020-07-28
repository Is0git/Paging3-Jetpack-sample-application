package com.is0git.paging3.network.services

import com.is0git.paging3.network.models.FeedGifResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GifService {
    @GET("v1/reactions/populated")
    suspend fun getFeedGifList(@Query("tagName") tagName: String, @Query("cursor") cursor: String?,  @Query("pageCount") pageCount: Int) : Response<FeedGifResponse>
}