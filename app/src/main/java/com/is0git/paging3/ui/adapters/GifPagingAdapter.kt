package com.is0git.paging3.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isEmpty
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.is0git.paging3.databinding.GifListItemLayoutBinding
import com.is0git.paging3.network.models.GfycatsItem
import com.is0git.paging3.utils.TimeUtils
import com.is0git.paging3.utils.addChip
import com.is0git.paging3.utils.loadImageFrom
import javax.inject.Inject

class GifPagingAdapter @Inject constructor() :
    PagingDataAdapter<GfycatsItem, GifPagingAdapter.GifViewHolder>(comparator) {
    override fun onBindViewHolder(holder: GifViewHolder, position: Int) {
        val item = getItem(position)
        holder.binding.apply {
            titleText.text = item?.title
            usernameText.text = item?.userDisplayName
            gifImageView loadImageFrom item?.gifUrl
            if (item?.tags != null && tagsChipGroup.isEmpty()) {
                for (tag in item.tags) {
                    tagsChipGroup addChip tag
                }
            }
            dateTimeText.text = TimeUtils.getTimeAgo(item?.createDate?.toLong())
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GifViewHolder {
        val binding = GifListItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return GifViewHolder(binding)
    }

    class GifViewHolder(val binding: GifListItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)
}

val comparator = object : DiffUtil.ItemCallback<GfycatsItem>() {
    override fun areItemsTheSame(oldItem: GfycatsItem, newItem: GfycatsItem): Boolean {
        return oldItem.gfyId == newItem.gfyId
    }

    override fun areContentsTheSame(oldItem: GfycatsItem, newItem: GfycatsItem): Boolean {
        return oldItem == newItem
    }

}