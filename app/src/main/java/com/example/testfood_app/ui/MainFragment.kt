package com.example.testfood_app.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testfood_app.data.models.Discount
import com.example.testfood_app.data.models.NewsModel
import com.example.testfood_app.data.models.NewsSourceModel
import com.example.testfood_app.databinding.FragmentMainBinding
import com.example.testfood_app.ui.adapter.discountsAdapter.DiscountsAdapter
import com.example.testfood_app.ui.adapter.newsAdapter.NewsAdapter
import com.example.testfood_app.ui.adapter.newsSourceAdapter.NewsSourceAdapter
import com.example.testfood_app.viewModels.NewsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var newsAdapter: NewsAdapter
    private lateinit var sourceAdapter: NewsSourceAdapter
    private lateinit var discountsAdapter: DiscountsAdapter

    private val viewModel: NewsViewModel by activityViewModels()

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

        discountsAdapter = DiscountsAdapter().apply {
            submitList(
                listOf(
                    Discount("afqwf"), Discount("asdad"), Discount("sdawd"),
                    Discount("sdfsfef"), Discount("asdasdagerb")
                )
            )
        }



        with(binding) {
            recyclerNews.apply {
                addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))
                adapter = newsAdapter
            }
            recyclerNewsSource.adapter = sourceAdapter
            recyclerDiscounts.adapter = discountsAdapter
        }






        viewModel.getSources()



        return binding.root
    }


}