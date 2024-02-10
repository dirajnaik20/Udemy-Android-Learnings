package com.example.androidlearning

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.navigation.fragment.navArgs
import com.example.androidlearning.databinding.FragmentInfoBinding
import com.example.androidlearning.presentation.viewmodel.NewsViewModel
import com.google.android.material.snackbar.Snackbar

class InfoFragment : Fragment() {

    private lateinit var fragmentInfoBinding: FragmentInfoBinding
    private lateinit var viewModel: NewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentInfoBinding = FragmentInfoBinding.bind(view)
        val args: InfoFragmentArgs by navArgs()
        val article = args.selectedArticle

        viewModel=(activity as MainActivity).viewModel

        fragmentInfoBinding.wvInfo.apply {
            webViewClient = WebViewClient()
            if (article.url !== "") {
                article.url?.let { loadUrl(it) }
                Log.i("MYTAG", "Iam in InfoFragment ${article.url.toString()}")
            }

        }

        fragmentInfoBinding.fabSave.setOnClickListener {
            viewModel.saveNews(article)
            Snackbar.make(view,"Article saved successfully!",Snackbar.LENGTH_LONG).show()
        }
    }
}