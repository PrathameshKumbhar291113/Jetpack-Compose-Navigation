package com.example.androidnavigationinjetpackcompose.home_module.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.androidnavigationinjetpackcompose.home_module.navigation.HomeModuleNavigationSetup
import com.example.androidnavigationinjetpackcompose.ui.theme.AndroidNavigationInJetpackComposeTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidNavigationInJetpackComposeTheme {
                HomeModuleNavigationSetup(navController = rememberNavController())
            }
        }
    }
}