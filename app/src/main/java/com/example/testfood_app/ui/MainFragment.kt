package com.example.testfood_app.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testfood_app.data.NewsModel
import com.example.testfood_app.databinding.FragmentMainBinding
import com.example.testfood_app.ui.adapter.MyAdapter


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var adapter: MyAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        adapter = MyAdapter().apply {
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
        with(binding) {
            recycler.adapter = adapter
        }










        return binding.root
    }


}