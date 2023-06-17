package com.example.testfood_app.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testfood_app.data.NewsModel
import com.example.testfood_app.data.NewsSourceModel
import com.example.testfood_app.databinding.FragmentMainBinding
import com.example.testfood_app.ui.adapter.newsAdapter.NewsAdapter
import com.example.testfood_app.ui.adapter.newsSourceAdapter.NewsSourceAdapter


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var newsAdapter: NewsAdapter
    private lateinit var sourceAdapter: NewsSourceAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        newsAdapter = NewsAdapter().apply {
            submitList(
                listOf(
                    NewsModel("qwe"),
                    NewsModel("sfwefwsev"),
                    NewsModel("asdascvv"),
                    NewsModel("qwecv  sdfae"),
                    NewsModel("asdfewfwv  asdadadx"),
                    NewsModel(" asd22"), NewsModel("qwe"),
                    NewsModel("sfwefwsev"),
                    NewsModel("asdascvv"),
                    NewsModel("qwecv  sdfae"),
                    NewsModel("asdfewfwv  asdadadx"),
                    NewsModel(" asd22"), NewsModel("qwe"),
                    NewsModel("sfwefwsev"),
                    NewsModel("asdascvv"),
                    NewsModel("qwecv  sdfae"),
                    NewsModel("asdfewfwv  asdadadx"),
                    NewsModel(" asd22"),
                )
            )
        }

        sourceAdapter = NewsSourceAdapter().apply {
            submitList(
                listOf(
                    NewsSourceModel("", "Goeefv", "", "", "", "", ""),
                    NewsSourceModel("", "sdvwerg", "", "", "", "", ""),
                    NewsSourceModel("", "asfsegerv", "", "", "", "", ""),
                    NewsSourceModel("", "asfacxca", "", "", "", "", ""),
                    NewsSourceModel("", "ascvrgr", "", "", "", "", ""),
                    NewsSourceModel("", "eqdqwd", "", "", "", "", ""),
                )
            )
        }
        with(binding) {
            recyclerNews.adapter = newsAdapter
            recyclerNewsSource.adapter = sourceAdapter
        }










        return binding.root
    }


}