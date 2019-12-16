package com.example.course_work.ui.information

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.course_work.R

class InformationFragment : Fragment() {

    private lateinit var informationViewModel: InformationViewModel
    private lateinit var informationViewModel2: InformationViewModel2
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        informationViewModel =
                ViewModelProviders.of(this).get(InformationViewModel::class.java)
        informationViewModel2 =
            ViewModelProviders.of(this).get(InformationViewModel2::class.java)
        val root = inflater.inflate(R.layout.fragment_information, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        val textView2: TextView = root.findViewById(R.id.textView)
        informationViewModel.text.observe(this, Observer {
            textView.text = it
        })
        informationViewModel2.text.observe(this, Observer {
            textView2.text = it
        })
        return root
    }
}