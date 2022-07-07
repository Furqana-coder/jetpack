package com.jetpack.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jetpack.myapplication.ui.theme.MyApplicationTheme



import android.annotation.SuppressLint
import android.app.AlertDialog
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch
import kotlin.random.Random
import androidx.compose.material.rememberScaffoldState as rememberScaffoldState1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn {
                itemsIndexed(listOf("this", "is", "router", "System"))
                { index, string ->
                    Text(
                        text = string,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 24.dp)
                    )
                }


            }
//            animate()
            CircularProgressbar(percentage = 0.8f, num =100)
         AlertDialog()

//            ImageCard(painter = painter as ColorPainter, contentDescriptor =descriptor , title =title )

//            JetPackTutorialTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Text("Hello")
//                }
//            }
        }
    }

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
            Box(
                modifier = Modifier
                    .background(color = Color.Red)
                    .weight(1f)
                    .fillMaxSize()
            )


        }
    }

    @SuppressLint("RememberReturnType")
    @Composable
    private fun SnackBarFun() {
        val scuffle = rememberScaffoldState1()

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

    /*
Style the text in android Studio
 */
    @Composable
    fun Styletotext() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0x111222))
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(color = Color.Green, fontSize = 50.sp)
                    ) {
                        append("J")
                    }
                    append("etPack")
                    withStyle(
                        style = SpanStyle(color = Color.Green, fontSize = 50.sp)
                    ) {
                        append("C")
                    }
                    append("etPack")

                },
                color = Color.Red, fontSize = 30.sp
            )
        }

    }

    @Composable
    fun Greeting(name: String) {

        /* Column(modifier = Modifier
         .fillMaxSize(0.5f)
         .width(100.dp)
         .background(Color.Blue), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly) {
         Text(text = "Hello $name!")
         Text(text = "World")
         Text(text = "Hi")


     }
   //  Output:This will align the column according to the width

     */
//       Row {
//           Text(text = "Hello $name!")
//           Text(text = "hi")
//       }

        /*
    Row(modifier = Modifier
        .fillMaxSize()
        .background(Color.Blue), horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically) {
        Text(text = "Hello $name!")
        Text(text = "World")
        Text(text = "Hi")
    }
   Output:Hello world world and hi will be in single row with spaces in between
     */
/*
    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .border(5.dp, Color.Magenta)
        .padding(6.dp)
        .border(5.dp, Color.Black)
        .padding(6.dp)
        .border(10.dp, Color.Blue)
        .padding(10.dp)
//        .requiredHeight(600.dp)
        .background(Color.Blue)) {
        Text(text = "Hello $name!", modifier = Modifier.offset(0.dp,0.5.dp).border(5.dp, Color.Magenta)
            .padding(6.dp)
            .offset(20.dp)
            .border(5.dp, Color.Black)
            .padding(6.dp)
            .offset(20.dp)
            .border(10.dp, Color.Blue)
            )

        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "World")
        Text(text = "Hi")

        //Output:Modifiers output with space and padding in between

*/

        val painter = painterResource(id = R.drawable.ic_launcher_background)
        val descriptor = "Hello"
        val title = "My First Card"
        ImageCard(painter = painter as ColorPainter, contentDescriptor = descriptor, title = title)


    }


    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        MyApplicationTheme {
            Greeting("World")

        }
    }



}
