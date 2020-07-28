package com.is0git.paging3.network.models

import com.squareup.moshi.Json

data class FeedGifResponse(

	@field:Json(name="cursor")
	val cursor: String? = null,

	@field:Json(name="gfycats")
	val gfycats: List<GfycatsItem>,

	@field:Json(name="digest")
	val digest: String? = null,

	@field:Json(name="tag")
	val tag: String? = null,

	@field:Json(name="tagText")
	val tagText: String? = null
)