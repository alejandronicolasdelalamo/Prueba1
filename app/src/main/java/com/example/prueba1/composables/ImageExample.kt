package com.example.prueba1.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prueba1.R


@Preview(showBackground = true)
@Composable
fun ImageExample(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.pina1),
                    contentDescription = "Piña",
                    modifier = Modifier.size(150.dp)
                )
                Text("Piña")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.sandia),
                    contentDescription = "Sandía",
                    modifier = Modifier.size(150.dp)
                )
                Text("Sandía")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.manzana),
                    contentDescription = "Manzana",
                    modifier = Modifier.size(150.dp)
                )
                Text("Manzana")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.naranja),
                    contentDescription = "Naranja",
                    modifier = Modifier.size(150.dp)
                )
                Text("Naranja")
            }
        }
    }
}
