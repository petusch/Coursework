package com.example.course_work.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel2 : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = " Адрес: \n\t270003, город Орша, улица Пушкина,\n\tдом Колотушкина \n" +
                " Телефоны регистрации: \n \t+8 800 555 35 35\n \t+8 029 814 40 07\n" +
                " Телефон главного врача:\n \t +8 800 555 35 35"
    }
    val text: LiveData<String> = _text
}