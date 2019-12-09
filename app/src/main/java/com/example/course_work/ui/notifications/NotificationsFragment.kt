package com.example.course_work.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.course_work.R

class NotificationsFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel
    private lateinit var notificationsViewModel2: NotificationsViewModel2
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notifications, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        val textView2: TextView = root.findViewById(R.id.textView)
        notificationsViewModel.text.observe(this, Observer {
            textView.text = it
        })
        notificationsViewModel2 =
            ViewModelProviders.of(this).get(NotificationsViewModel2::class.java)
        notificationsViewModel2.text.observe(this, Observer {
            textView2.text = it
        })
        return root
    }
}