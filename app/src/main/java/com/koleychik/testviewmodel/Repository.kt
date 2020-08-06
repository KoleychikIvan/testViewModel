package com.koleychik.testviewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData

public class Repository() {

    fun getAll() : MutableLiveData<Model>{
        return MutableLiveData(Model(1, "Evan"))
    }

}