package com.example.androidnavigationinjetpackcompose.core

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.androidnavigationinjetpackcompose.home_module.presentation.HomeActivity
import kotlinx.coroutines.delay
import kotlinx.serialization.Serializable


@Serializable
object SplashScreen

@Composable
fun SplashScreen(){

    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Splash Screen")
    }

    LaunchedEffect(key1 = Unit) {
        delay(3000)
        val intent = Intent(context, HomeActivity::class.java)
        context.startActivity(intent)
    }

}