package com.example.course_work.ui.TicketActivities

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.course_work.R

import kotlinx.android.synthetic.main.activity_time.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T


import android.app.AlertDialog
import android.widget.Toast
import android.content.DialogInterface
import android.content.Intent

import android.widget.TextView
import com.example.course_work.MainActivity
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_time.text_notifications1
import kotlinx.android.synthetic.main.activity_time.text_notifications2
import kotlinx.android.synthetic.main.activity_time.text_notifications3
import kotlinx.android.synthetic.main.activity_time.text_notifications4
import kotlinx.android.synthetic.main.activity_time.view.*
import kotlinx.android.synthetic.main.fragment_home.*


class TimeActivity : AppCompatActivity() {
    var ad: AlertDialog.Builder? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val time1 = "9:00"
        val time2 = "10:00"
        val time3 = "11:00"
        val time4 = "12:00"
        val time5 = "13:00"
        setContentView(R.layout.activity_time)
        text_notifications1.setText(time1)
        text_notifications2.setText(time2)
        text_notifications3.setText(time3)
        text_notifications4.setText(time4)
        text_notifications5.setText(time5)
        text_notifications1.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            startActivity(intent)    }
        text_notifications2.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            startActivity(intent)    }
        text_notifications3.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            startActivity(intent)    }
        text_notifications4.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            startActivity(intent)    }
    }
}
