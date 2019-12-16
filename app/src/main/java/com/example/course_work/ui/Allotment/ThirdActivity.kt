package com.example.course_work.ui.Allotment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.course_work.R
import com.example.course_work.ui.TicketActivities.DateActivity
import kotlinx.android.synthetic.main.fragment_home.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        text_notifications1.setOnClickListener{
            val intent = Intent(this, DateActivity::class.java)
            // start your next activity
            startActivity(intent)    }
        text_notifications2.setOnClickListener{
            val intent = Intent(this, DateActivity::class.java)
            // start your next activity
            startActivity(intent)    }
    }
}
