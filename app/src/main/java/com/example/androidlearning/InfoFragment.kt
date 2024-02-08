package com.example.androidlearning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.navigation.fragment.navArgs
import com.example.androidlearning.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private lateinit var fragmentInfoBinding: FragmentInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentInfoBinding = FragmentInfoBinding.bind(view)
        val args: InfoFragmentArgs by navArgs()
        val article = args.selectedArticle

        fragmentInfoBinding.wvInfo.apply {
            webViewClient = WebViewClient()
            if (article.url !== "") {
                article.url?.let { loadUrl(it) }
            }

        }
    }
}