package com.example.androidnavigationinjetpackcompose.model

import kotlinx.serialization.Serializable

@Serializable
data class ScreenBArgs(
    var name: String?,
    var age: Int
)
