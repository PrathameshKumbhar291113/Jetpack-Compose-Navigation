package com.example.androidnavigationinjetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.example.androidnavigationinjetpackcompose.model.ScreenBArgs

@Composable
fun AppNavigationSetup(navController: NavHostController) {

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