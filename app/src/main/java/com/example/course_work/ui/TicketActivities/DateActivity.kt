package com.example.course_work.ui.TicketActivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.course_work.R
import kotlinx.android.synthetic.main.activity_date.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_second.text_notifications4
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.text_notifications1
import kotlinx.android.synthetic.main.fragment_home.text_notifications2
import kotlinx.android.synthetic.main.fragment_home.text_notifications3

class DateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date)
        text_notifications1.setOnClickListener {
            val intent = Intent(this, TimeActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
        text_notifications2.setOnClickListener {
            val intent = Intent(this, TimeActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
        text_notifications3.setOnClickListener {
            val intent = Intent(this, TimeActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
        text_notifications4.setOnClickListener {
            val intent = Intent(this, TimeActivity::class.java)
            // start your next activity
            startActivity(intent)

        }
        text_notifications5.setOnClickListener{
            val intent = Intent(this, TimeActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}
