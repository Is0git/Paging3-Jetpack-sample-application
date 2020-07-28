package com.is0git.paging3.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.is0git.paging3.databinding.GifFeedFragmentLayoutBinding
import com.is0git.paging3.ui.adapters.GifPagingAdapter
import com.is0git.paging3.ui.adapters.GiftLoadStateAdapter
import com.is0git.paging3.vm.GifViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class GifFeedFragment : Fragment() {
    lateinit var binding: GifFeedFragmentLayoutBinding
    @Inject
    lateinit var gifAdapter: GifPagingAdapter
    private val gifViewModel: GifViewModel by viewModels()
    private lateinit var giftLoadStateAdapter: GiftLoadStateAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = GifFeedFragmentLayoutBinding.inflate(inflater, container, false)
        giftLoadStateAdapter = GiftLoadStateAdapter(this::retry, this::reset)
        binding.gifList.adapter = gifAdapter.withLoadStateFooter(giftLoadStateAdapter)
        observe()
        return binding.root
    }

    private fun observe() {
        lifecycleScope.launch {
            gifViewModel.pagedDataFlow.collect {
                gifAdapter.submitData(it)
            }
        }
    }

    private fun retry() {
        gifAdapter.retry()
    }

    private fun reset() {
        gifAdapter.refresh()
    }
}