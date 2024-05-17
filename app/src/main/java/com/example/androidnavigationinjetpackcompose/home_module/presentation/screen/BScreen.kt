package com.example.androidnavigationinjetpackcompose.home_module.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androidnavigationinjetpackcompose.model.ScreenBArgs

@Composable
fun BScreen(navController: NavController, args: ScreenBArgs) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home Module Screen B")

        Spacer(modifier = Modifier.height(60.dp))

        Text(text = args.name.toString())

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = args.age.toString() )

    }


}