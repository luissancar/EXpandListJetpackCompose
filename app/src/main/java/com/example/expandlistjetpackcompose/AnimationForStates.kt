package com.example.expandlistjetpackcompose

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Divider
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun AnimationForStates()
{
    DrawLayerWithAnimationAsStateAnimation()
   // Divider()
}

@Composable
fun DrawLayerWithAnimationAsStateAnimation() {
    Spacer(modifier = Modifier.padding(20.dp))
    var draw by remember { mutableStateOf(false) }

    Box {
        Image(
            painter = painterResource(id = R.drawable.ima01),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw) 30f else 5f).value,
                    translationX = animateFloatAsState(if (draw) 320f else 0f).value,
                    translationY = 0f
                )
                .clickable { draw = !draw }
        )
        Image(
            painter = painterResource(id = R.drawable.ima02),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw) 30f else 10f).value,
                    translationX = animateFloatAsState(if (draw) -320f else 0f).value,
                    translationY = animateFloatAsState(if (draw) 0f else 30f).value
                )
                .clickable { draw = !draw }
        )
        Image(
            painter = painterResource(id = R.drawable.ima03),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw) 30f else 5f).value,
                    translationY = animateFloatAsState(if (draw) 0f else 50f).value
                )
                .clickable { draw = !draw }
        )
    }

    Spacer(modifier = Modifier.padding(30.dp))
    var draw1 by remember { mutableStateOf(false) }

    Box {
        Image(
            painter = painterResource(id = R.drawable.ima04),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw1) 30f else 5f).value,
                    translationX = animateFloatAsState(if (draw1) 320f else 0f).value,
                    rotationY = animateFloatAsState(if (draw1) 45f else 0f).value,
                    translationY = 0f
                )
                .clickable { draw1 = !draw1 }
        )
        Image(
            painter = painterResource(id = R.drawable.ima05),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw1) 30f else 10f).value,
                    translationX = animateFloatAsState(if (draw1) -320f else 0f).value,
                    rotationY = animateFloatAsState(if (draw1) 45f else 0f).value,
                    translationY = animateFloatAsState(if (draw1) 0f else 30f).value
                )
                .clickable { draw1 = !draw1 }
        )
        Image(
            painter = painterResource(id = R.drawable.ima06),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw1) 30f else 5f).value,
                    translationY = animateFloatAsState(if (draw1) 0f else 50f).value,
                    rotationY = animateFloatAsState(if (draw1) 45f else 0f).value
                )
                .clickable { draw1 = !draw1 }
        )
    }

    Spacer(modifier = Modifier.padding(30.dp))
    var draw2 by remember { mutableStateOf(false) }

    Box {
        Image(
            painter = painterResource(id = R.drawable.ima07),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw2) 30f else 5f).value,
                    translationX = animateFloatAsState(if (draw2) 320f else 0f).value,
                    rotationZ = animateFloatAsState(if (draw2) 45f else 0f).value,
                    translationY = 0f
                )
                .clickable { draw2 = !draw2 }
        )
        Image(
            painter = painterResource(id = R.drawable.ima08),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw2) 30f else 10f).value,
                    translationX = animateFloatAsState(if (draw2) -320f else 0f).value,
                    rotationZ = animateFloatAsState(if (draw2) 45f else 0f).value,
                    translationY = animateFloatAsState(if (draw2) 0f else 30f).value
                )
                .clickable { draw2 = !draw2 }
        )
        Image(
            painter = painterResource(id = R.drawable.ima09),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw2) 30f else 5f).value,
                    translationY = animateFloatAsState(if (draw2) 0f else 50f).value,
                    rotationZ = animateFloatAsState(if (draw2) 45f else 0f).value,
                )
                .clickable { draw2 = !draw2 }
        )
        Spacer(modifier = Modifier.padding(60.dp))
    }
}
