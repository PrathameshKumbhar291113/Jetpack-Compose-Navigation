package com.example.androidnavigationinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.androidnavigationinjetpackcompose.model.ScreenBArgs
import com.example.androidnavigationinjetpackcompose.ui.theme.AndroidNavigationInJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidNavigationInJetpackComposeTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = SplashScreen
                ) {
                    composable<SplashScreen> {
                        SplashScreen(navController = navController)
                    }
                    composable<ScreenA> {
                        AScreen(navController = navController)
                    }
                    composable<ScreenBArgs> {
                        var args = it.toRoute<ScreenBArgs>()
                        BScreen(navController = navController, args)
                    }


                }
            }
        }
    }
}