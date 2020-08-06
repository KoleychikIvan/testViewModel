package com.koleychik.testviewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class MyViewModel(private val repository: Repository) : ViewModel() {

    fun getAll() : MutableLiveData<Model> = repository.getAll()
}