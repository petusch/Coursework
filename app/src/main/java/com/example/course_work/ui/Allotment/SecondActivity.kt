package com.example.course_work.ui.Allotment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.course_work.R
import com.example.course_work.ui.TicketActivities.DateActivity
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.text_notifications1
import kotlinx.android.synthetic.main.fragment_home.text_notifications2
import kotlinx.android.synthetic.main.fragment_home.text_notifications3

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        text_notifications1.setOnClickListener{
        val intent = Intent(this, DateActivity::class.java)
        // start your next activity
        startActivity(intent)    }
        text_notifications2.setOnClickListener{
        val intent = Intent(this, DateActivity::class.java)
        // start your next activity
        startActivity(intent)    }
        text_notifications3.setOnClickListener{
            val intent = Intent(this, DateActivity::class.java)
            // start your next activity
            startActivity(intent)    }
        text_notifications4.setOnClickListener{
            val intent = Intent(this, DateActivity::class.java)
            // start your next activity
            startActivity(intent)    }

    }
}

