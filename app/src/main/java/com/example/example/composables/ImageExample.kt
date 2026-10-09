package com.example.example.composables

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.example.R

@Preview
@Composable
fun ImageExample(){
    Image(painter = painterResource(id = R.drawable.togif),
        contentDescription = "Imagen de ejemplo")
}