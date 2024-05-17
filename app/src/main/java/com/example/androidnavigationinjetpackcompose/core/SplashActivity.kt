package com.example.androidnavigationinjetpackcompose.core

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidnavigationinjetpackcompose.core.ui.theme.AndroidNavigationInJetpackComposeTheme

@SuppressLint("CustomSplashScreen")
class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidNavigationInJetpackComposeTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = SplashScreen) {

                    composable<SplashScreen> {
                        SplashScreen()
                    }
                }

            }
        }
    }
}