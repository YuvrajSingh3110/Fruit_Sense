package com.example.fruitsrecognition.domain

import android.graphics.Bitmap

interface FruitClassifier {
    fun classify(bitmap: Bitmap, rotation: Int): List<Classification>
}