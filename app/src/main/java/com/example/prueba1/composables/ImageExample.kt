package com.example.prueba1.composables

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.prueba1.R


@Preview
@Composable
fun ImageExample(){
    Image(painter = painterResource(id = R.drawable.mario),
        contentDescription ="User Avatar"
    )
}
