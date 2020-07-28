package com.is0git.paging3.network.models

import com.squareup.moshi.Json

data class GfycatsItem(

	@Json(name="max2mbGif")
	val max2mbGif: String? = null,

	@Json(name="userData")
	val userData: UserData? = null,

	@Json(name="source")
	val source: Int? = null,

	@Json(name="frameRate")
	val frameRate: Double? = null,

	@Json(name="sitename")
	val sitename: String? = null,

	@Json(name="geoWhitelist")
	val geoWhitelist: List<Any?>? = null,

	@Json(name="likes")
	val likes: String? = null,

	@Json(name="height")
	val height: Int? = null,

	@Json(name="userProfileImageUrl")
	val userProfileImageUrl: String? = null,

	@Json(name="avgColor")
	val avgColor: String? = null,

	@Json(name="dislikes")
	val dislikes: String? = null,

	@Json(name="published")
	val published: Int? = null,

	@Json(name="gif100px")
	val gif100px: String? = null,

	@Json(name="thumb100PosterUrl")
	val thumb100PosterUrl: String? = null,

	@Json(name="tags")
	val tags: List<String?>? = null,

	@Json(name="gifUrl")
	val gifUrl: String? = null,

	@Json(name="gfyNumber")
	val gfyNumber: String? = null,

	@Json(name="mp4Size")
	val mp4Size: Int? = null,

	@Json(name="languageCategories")
	val languageCategories: List<String?>? = null,

	@Json(name="max5mbGif")
	val max5mbGif: String? = null,

	@Json(name="description")
	val description: String? = null,

	@Json(name="webpUrl")
	val webpUrl: String? = null,

	@Json(name="title")
	val title: String? = null,

	@Json(name="posterUrl")
	val posterUrl: String? = null,

	@Json(name="mobilePosterUrl")
	val mobilePosterUrl: String? = null,

	@Json(name="webmSize")
	val webmSize: Int? = null,

	@Json(name="mobileUrl")
	val mobileUrl: String? = null,

	@Json(name="gfyName")
	val gfyName: String? = null,

	@Json(name="views")
	val views: Int? = null,

	@Json(name="createDate")
	val createDate: Int? = null,

	@Json(name="webmUrl")
	val webmUrl: String? = null,

	@Json(name="hasAudio")
	val hasAudio: Boolean? = null,

	@Json(name="extraLemmas")
	val extraLemmas: String? = null,

	@Json(name="nsfw")
	val nsfw: String? = null,

	@Json(name="userDisplayName")
	val userDisplayName: String? = null,

	@Json(name="miniUrl")
	val miniUrl: String? = null,

	@Json(name="userName")
	val userName: String? = null,

	@Json(name="max1mbGif")
	val max1mbGif: String? = null,

	@Json(name="gfyId")
	val gfyId: String? = null,

	@Json(name="url")
	val url: String? = null,

	@Json(name="numFrames")
	val numFrames: Int? = null,

	@Json(name="languageText")
	val languageText: String? = null,

	@Json(name="miniPosterUrl")
	val miniPosterUrl: String? = null,

	@Json(name="width")
	val width: Int? = null,

	@Json(name="mp4Url")
	val mp4Url: String? = null,

	@Json(name="gfySlug")
	val gfySlug: String? = null,

	@Json(name="md5")
	val md5: String? = null
)