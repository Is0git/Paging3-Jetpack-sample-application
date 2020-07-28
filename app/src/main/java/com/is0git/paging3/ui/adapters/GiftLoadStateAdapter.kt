package com.is0git.paging3.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.RecyclerView
import com.is0git.paging3.databinding.GiftListFooterLayoutBinding

class GiftLoadStateAdapter(
    private var retry: () -> Unit,
    private var refresh: () -> Unit
) : LoadStateAdapter<LoadStateViewHolder>() {
    override fun onBindViewHolder(holder: LoadStateViewHolder, loadState: LoadState) {
        holder.bind(loadState)
    }

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): LoadStateViewHolder {
        val binding = GiftListFooterLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return LoadStateViewHolder(binding)
    }
}

class LoadStateViewHolder(val binding: GiftListFooterLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(loadState: LoadState) {
        when (loadState) {
            is LoadState.Error -> {
                binding.errorText.text = loadState.error.localizedMessage
            }
            is LoadState.Loading -> {
                binding.progressBar.visibility = View.VISIBLE
            }
            is LoadState.NotLoading -> {
                binding.refreshButton.visibility = View.VISIBLE
                binding.clearButton.visibility = View.VISIBLE
            }
        }
    }
}
