package com.koleychik.testviewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TestViewModel {

    @get:Rule
    val instantTaskExecutorRule : InstantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    lateinit var repository : Repository

    @InjectMocks
    lateinit var viewModel: MyViewModel

    @Before
    fun setUp(){
        `when`(repository.getAll()).thenReturn(getAll())
        viewModel = MyViewModel(repository)
    }

    @Test
    fun should_return_true(){
        assertThat(viewModel.getAll()).isEqualTo(repository.getAll())
    }

    private fun getAll() : MutableLiveData<Model>{
        val model = Model(1, "Evan")
        return MutableLiveData(model)
    }
}