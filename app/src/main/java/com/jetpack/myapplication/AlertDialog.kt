package com.jetpack.myapplication

import android.app.AlertDialog
import android.widget.Toast
import androidx.compose.material.AlertDialog
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

@Composable
fun AlertDialog()
{
    val context= LocalContext.current;
    val openDialog= remember{
        mutableStateOf(true)
    }

    if(openDialog.value)
    {
        AlertDialog(
            onDismissRequest = { openDialog.value=false },
            title= { Text(text = "here is the text") },
            text = { Text(text = "Alert Dialog box ") },
            confirmButton = {
                TextButton(onClick = {
                    openDialog.value=false
                    Toast.makeText(context,"Clicked on Confirm", Toast.LENGTH_SHORT).show()
                }) {
                    Text(text = "Confirm", color = Color.Black)
                }
            },
            dismissButton = {
                TextButton(onClick = {
                    openDialog.value=false
                    Toast.makeText(context,"Clicked on Dismiss", Toast.LENGTH_SHORT).show()
                }) {
                    Text(text = "Dismiss", color = Color.Black)
                }
            })
    }
}