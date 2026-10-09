package com.example.prueba1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.prueba1.composables.BoxExample
import com.example.prueba1.composables.ButtonExample
import com.example.prueba1.composables.ImageExample
import com.example.prueba1.composables.RowExample
import com.example.prueba1.composables.TextExample
import com.example.prueba1.ui.theme.Prueba1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prueba1Theme {
                TextExample(name = "Majo")
                ImageExample()



            }
        }
    }
}

@Composable
fun Example(){
    Text(text = "Hola muy buenas tardes")
}
