package com.example.androidnavigationinjetpackcompose.home_module.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androidnavigationinjetpackcompose.model.ScreenAState
import com.example.androidnavigationinjetpackcompose.model.ScreenBArgs
import kotlinx.serialization.Serializable

@Serializable
object ScreenA

@Composable
fun AScreen(navController: NavController) {

    val screenAState = remember {
        mutableStateOf<ScreenAState>(
            ScreenAState(
                name = "",
                age = 0
            )
        )
    }

    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Home Module Screen A")

        Spacer(modifier = Modifier.height(60.dp))

        OutlinedTextField(
            value = screenAState.value.name.toString(),
            onValueChange = {
                screenAState.value = screenAState.value.copy(name = it)
            }
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = screenAState.value.age.toString(),
            onValueChange = {
                screenAState.value = screenAState.value.copy(age = it.toInt())
            },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(onClick = {
            navController.navigate(
                ScreenBArgs(
                    name = screenAState.value.name,
                    age = screenAState.value.age.toString().toInt()
                )
            )
        }) {
            Text(text = "Go to screen B")
        }

        Spacer(modifier = Modifier.height(40.dp))

        Button(onClick = {
            navController.navigate(
                ScreenBArgs(
                    name = screenAState.value.name,
                    age = screenAState.value.age.toString().toInt()
                )
            )
        }) {
            Text(text = "Go to screen Auth Module")
        }
    }

}