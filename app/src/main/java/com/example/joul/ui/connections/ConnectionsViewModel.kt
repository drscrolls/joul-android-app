package com.example.joul.ui.connections

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ConnectionsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is connections Fragment"
    }
    val text: LiveData<String> = _text
}