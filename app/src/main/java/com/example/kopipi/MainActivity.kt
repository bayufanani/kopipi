package com.example.kopipi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kopipi.ui.theme.KopipiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KopipiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android 998")
                }
            }
        }
    }
}

data class Kertas(val nama:String, val harga: Int)

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val listComp = listOf<Kertas>(Kertas("bayu", 1000), Kertas("hoo", 1200))
    Column {
        Row {
            for (e in listComp)
            Card(modifier=Modifier.padding(8.dp)) {
                Column(modifier=Modifier.padding(16.dp,8.dp)) {
                    Text(text = e.nama)
                    Text(text = e.harga.toString())
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KopipiTheme {
        Greeting("Android")
    }
}