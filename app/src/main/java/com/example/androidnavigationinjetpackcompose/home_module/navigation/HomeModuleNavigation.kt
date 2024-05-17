package com.example.androidnavigationinjetpackcompose.home_module.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.example.androidnavigationinjetpackcompose.home_module.presentation.screen.AScreen
import com.example.androidnavigationinjetpackcompose.home_module.presentation.screen.BScreen
import com.example.androidnavigationinjetpackcompose.home_module.presentation.screen.ScreenA
import com.example.androidnavigationinjetpackcompose.model.ScreenBArgs

@Composable
fun HomeModuleNavigationSetup(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = ScreenA
    ) {
        composable<ScreenA> {
            AScreen(navController = navController)
        }
        composable<ScreenBArgs> {
            var args = it.toRoute<ScreenBArgs>()
            BScreen(navController = navController, args)
        }
    }
}