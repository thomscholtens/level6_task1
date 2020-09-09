package com.example.level6_task1.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.level6_task1.model.ColorItem
import com.example.level6_task1.recyclerview.ColorRepository

class ColorViewModel : ViewModel() {
    private val colorRepository = ColorRepository()

    val colorItems: LiveData<List<ColorItem>>
        get() = _colorItems

    private val _colorItems = MutableLiveData<List<ColorItem>>().apply {
        value = colorRepository.getColorItems()
    }


}