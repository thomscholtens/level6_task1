package com.example.level6_task1.recyclerview

import com.example.level6_task1.model.ColorItem


class ColorRepository {
    fun getColorItems(): List<ColorItem> {
        return arrayListOf(
            ColorItem("000000", "Black"),
            ColorItem("FF0000", "Red"),
            ColorItem("0000FF", "Blue"),
            ColorItem("FFFF00", "Yellow"),
            ColorItem("008000", "Green")
        )
    }
}
