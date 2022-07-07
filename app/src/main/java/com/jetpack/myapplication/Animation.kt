package com.jetpack.myapplication

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.unit.dp

@Composable
fun animate()
{
    var statesize by remember {
        mutableStateOf(200.dp)
    }

    val size by animateDpAsState(targetValue = statesize)
    Box(modifier = Modifier
        .size(size)
        .background(Color.Red), contentAlignment = Alignment.Center)
    {
        Button(onClick = { statesize+=50.dp }) {
            Text("Increase Size")

        }
    }


}