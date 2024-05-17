package com.example.androidnavigationinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.androidnavigationinjetpackcompose.ui.theme.AndroidNavigationInJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidNavigationInJetpackComposeTheme {
                val navController = rememberNavController()
                AppNavigationSetup(navController = navController)
            }
        }
    }
}