package com.jetpack.myapplication
import android.graphics.fonts.FontStyle
import androidx.compose.animation.core.FloatDecayAnimationSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun CircularProgressbar(
    percentage:Float,
    num:Int, fontSize: Dp =28.dp,
    radius:Dp=50.dp,
    color: Color = androidx.compose.ui.graphics.Color.Green,
    strokewidth:Dp=8.dp,
    animationDuration:Int=1000,
    animDelay:Int=0)
{
    var animationPlayed by remember {
        mutableStateOf(false)
    }
    val currentPer= animateFloatAsState(targetValue = if (animationPlayed) percentage else 0f
    , animationSpec = tween(durationMillis = animationDuration,
        delayMillis = animDelay)
    )
  LaunchedEffect(key1 =true)
  {
      animationPlayed=true
  }

    Box(contentAlignment = Alignment.Center, modifier = Modifier.size(radius*2f))
    {
        Canvas(modifier = Modifier.size(radius*2f))
        {
            drawArc(color = color,-90f,360*currentPer.value, useCenter = false, style= Stroke(strokewidth.toPx(),cap= StrokeCap.Round))
        }
    }

    //Output:Its gives circular progress dialog
}