package com.example.example.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun PantallaUsuario(){
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()){
        Row(modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(painter = painterResource(id = com.example.example.R.drawable.togif),
                contentDescription = "Imagen de ejemplo")
        }

        Column(modifier = Modifier.background(Color.DarkGray)){
            Text("Hola")

        }
        Button(onClick = {}) {
            Text("Shhhh")
        }
        }
    }

