package com.jetpack.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.unit.dp

@Composable
fun RowColumn(name: String) {

    Column(
        modifier = Modifier
            .fillMaxSize(0.5f)
            .width(100.dp)
            .background(androidx.compose.ui.graphics.Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Hello $name!")
        Text(text = "World")
        Text(text = "Hi")
    }

//  Output:This will align the column according to the width


       Row {
           Text(text = "Hello $name!")
           Text(text = "hi")
       }


        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(androidx.compose.ui.graphics.Color.Blue),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Hello $name!")
            Text(text = "World")
            Text(text = "Hi")

//Output:Hello world world and hi will be in single row with spaces in between

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .border(5.dp, androidx.compose.ui.graphics.Color.Magenta)
                    .padding(6.dp)
                    .border(5.dp, androidx.compose.ui.graphics.Color.Black)
                    .padding(6.dp)
                    .border(10.dp, androidx.compose.ui.graphics.Color.Blue)
                    .padding(10.dp)
//        .requiredHeight(600.dp)
                    .background(androidx.compose.ui.graphics.Color.Blue)
            ) {
                Text(
                    text = "Hello $name!",
                    modifier = Modifier.offset(0.dp, 0.5.dp).border(5.dp, androidx.compose.ui.graphics.Color.Magenta)
                        .padding(6.dp)
                        .offset(20.dp)
                        .border(5.dp, androidx.compose.ui.graphics.Color.Black)
                        .padding(6.dp)
                        .offset(20.dp)
                        .border(10.dp, androidx.compose.ui.graphics.Color.Blue)
                )

                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "World")
                Text(text = "Hi")

                //Output:Modifiers output with space and padding in between


            }
        }

    }
