package com.example.expandlistjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.expandlistjetpackcompose.ui.theme.EXpandListJetpackComposeTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EXpandListJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                        Greeting()
                    }
                }
            }
        }
    }


@Composable
fun Greeting() {
    Scaffold (
        topBar =  {
            TopAppBar(

                title = {
                    Text(
                        text = "Listas Expand",    // Texto pantalla
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )

                    }
                    )


        },
        content = {
            AnimationExpandList()
        }
    )


}

@Composable
fun AnimationExpandList() {
    LazyColumn(
        state = rememberLazyListState(),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize())
    {
        item {AnimationForStates()}
        item { Spacer(modifier = Modifier.padding(50.dp))}
    }
}



























@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EXpandListJetpackComposeTheme {
        Greeting()
    }
}