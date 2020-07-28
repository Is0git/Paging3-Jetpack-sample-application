package com.is0git.paging3.network.models

import com.squareup.moshi.Json

data class UserData(

	@Json(name="profileUrl")
	val profileUrl: String? = null,

	@Json(name="followers")
	val followers: Int? = null,

	@Json(name="following")
	val following: Int? = null,

	@Json(name="name")
	val name: String? = null,

	@Json(name="verified")
	val verified: Boolean? = null,

	@Json(name="subscription")
	val subscription: Int? = null,

	@Json(name="profileImageUrl")
	val profileImageUrl: String? = null,

	@Json(name="url")
	val url: String? = null,

	@Json(name="views")
	val views: Int? = null,

	@Json(name="username")
	val username: String? = null
)