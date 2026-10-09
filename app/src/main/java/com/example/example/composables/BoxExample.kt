package com.example.example.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun BoxExample(){
    Box(modifier = Modifier.size(100.dp)){
        Text("Hola")
        Button(onClick = {}) {
            Text("Shhhh")
        }
    }
    }