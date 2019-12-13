package com.example.course_work.ui.Allotment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.course_work.R
import com.example.course_work.ui.TicketActivities.DateActivity
import kotlinx.android.synthetic.main.fragment_home.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
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
    }


}

