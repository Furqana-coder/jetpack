package com.jetpack.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
private fun Snackbar() {
    val scuffle = rememberScaffoldState()

    var textfield by remember {
        mutableStateOf("")
    }
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scuffle
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
        ) {

            TextField(value = textfield, label = {
                Text(text = "Hello World")
            }, onValueChange = {
                textfield = it.toString()
            },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}