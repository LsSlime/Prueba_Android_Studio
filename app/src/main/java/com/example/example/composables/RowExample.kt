package com.example.example.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable

fun RowExample(){
    Row(modifier = Modifier.size(150.dp)){
        Text("Hola")
        Text("Hola")
        Text("Hola")
    }
    }