package com.koleychik.testviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

object MainFactory : ViewModelProvider.Factory {

    private val dataSource = Repository()

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return MyViewModel(dataSource) as T
    }
}