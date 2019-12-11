package com.example.course_work.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.course_work.R
import com.example.course_work.ui.Allotment.*
import com.example.course_work.ui.CommonActivity

import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text_notifications1.setOnClickListener{
            val intent = Intent(context, FirstActivity::class.java)
            startActivity(intent)
                }

        text_notifications2.setOnClickListener{
            val intent = Intent(context, SecondActivity::class.java)
            startActivity(intent)
        }

        text_notifications3.setOnClickListener{
            val intent = Intent(context, ThirdActivity::class.java)
            startActivity(intent)
        }
        }
    }
