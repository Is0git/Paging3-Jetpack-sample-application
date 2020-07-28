package com.is0git.paging3.utils

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

infix fun ImageView.loadImageFrom(url: String?) {
    Glide.with(this)
        .load(url)
        .centerCrop()
        .into(this)
}