package com.example.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    //instanciado live data
    private val _textWelcome = MutableLiveData<String>()
    val textWelcome = _textWelcome

    fun welcome(): LiveData<String> {
        _textWelcome.value = "Olá"
        return textWelcome
    }

}