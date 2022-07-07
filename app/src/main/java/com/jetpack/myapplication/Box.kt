package com.jetpack.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
private fun Box() {


    val painter = painterResource(id = R.drawable.ic_launcher_background)
    val descriptor = "Hello"
    val title = "My First Card"
    Column(Modifier.fillMaxSize()) {

        ColorBox(
            Modifier
                .fillMaxSize()
                .weight(1f)
        )
        androidx.compose.foundation.layout.Box(
            modifier = Modifier
                .background(color = Color.Red)
                .weight(1f)
                .fillMaxSize()
        )


    }

    //Box with color red
}