package com.example.course_work.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.course_work.R
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.course_work.MainActivity


class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        dashboardViewModel.text.observe(this, Observer {
            textView.text = it
        })
        val listView = root.findViewById<ListView>(R.id.listView)

// определяем строковый массив
        val catNames = arrayOf(
            "Рыжик",
            "Барсик",
            "Мурзик",
            "Мурка",
            "Васька",
            "Томасина",
            "Кристина",
            "Пушок",
            "Дымка",
            "Кузя",
            "Китти",
            "Масяня",
            "Симба"
        )




        listView.adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            catNames
        )
        return root
    }
}