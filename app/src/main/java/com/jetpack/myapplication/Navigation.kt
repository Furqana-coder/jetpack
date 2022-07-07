package com.jetpack.myapplication

import android.widget.Toast
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavHostController
import androidx.navigation.NavHost as NavHost1

@Composable
fun Navigation(
    navController: NavHostController,
    onEventClicked : (String) -> Unit
) {
    Text(text = "Navigation")

}