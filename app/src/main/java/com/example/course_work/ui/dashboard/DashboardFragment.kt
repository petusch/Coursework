package com.example.course_work.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.course_work.R
import com.example.course_work.ui.Doctors.*
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    var array = arrayOf("Melbourne", "Vienna", "Vancouver", "Toronto", "Calgary", "Adelaide", "Perth", "Auckland", "Helsinki", "Hamburg", "Munich", "New York", "Sydney", "Paris", "Cape Town", "Barcelona", "London", "Bangkok")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        dashboardViewModel =
//                ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
//        val textView: TextView = root.findViewById(R.id.text_dashboard)
//        dashboardViewModel.text.observe(this, Observer {
//            textView.text = it
//        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text_notifications1.setOnClickListener{
            val intent = Intent(context, CommonActivity::class.java)
            // start your next activity
            startActivity(intent)    }
        text_notifications2.setOnClickListener{
            val intent = Intent(context, LORActivity::class.java)
            // start your next activity
            startActivity(intent)    }
        text_notifications3.setOnClickListener{
            val intent = Intent(context, OculusActivity::class.java)
            // start your next activity
            startActivity(intent)    }
        text_notifications4.setOnClickListener{
            val intent = Intent(context, OnkologistActivity::class.java)
            // start your next activity
            startActivity(intent)    }
        text_notifications5.setOnClickListener{
            val intent = Intent(context, PsychoActivity::class.java)
            // start your next activity
            startActivity(intent)    }
        text_notifications6.setOnClickListener{
            val intent = Intent(context, DentistActivity::class.java)
            // start your next activity
            startActivity(intent)    }
        text_notifications7.setOnClickListener{
            val intent = Intent(context, CardioActivity::class.java)
            // start your next activity
            startActivity(intent)    }
        text_notifications8.setOnClickListener{
            val intent = Intent(context, NeuroActivity::class.java)
            // start your next activity
            startActivity(intent)    }
        text_notifications9.setOnClickListener{
            val intent = Intent(context, DietActivity::class.java)
            // start your next activity
            startActivity(intent)    }
}}