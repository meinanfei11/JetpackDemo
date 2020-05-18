package com.example.myapplication.ui.publish

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.lib_annotation.FragmentDestination
import com.example.myapplication.R
import com.example.myapplication.ui.home.HomeViewModel

@FragmentDestination(pageUrl = "main/tabs/publish", asStart = true)
class PublishFragment : Fragment() {

    private lateinit var publishFragment: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        publishFragment =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        publishFragment.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}