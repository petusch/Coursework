package com.example.course_work.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Оршанская \n Поликлиника №1 \n Время Работы: \n 7:00 - 20:00"
    }
    val text: LiveData<String> = _text
}