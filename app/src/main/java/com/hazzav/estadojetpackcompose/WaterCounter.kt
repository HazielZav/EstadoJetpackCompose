package com.hazzav.estadojetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun WaterCounter(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(top = 40.dp, start = 16.dp)
    ) {
        var contador by remember { mutableStateOf(0) }
        Text(
            text = "Has tomado $contador vasos de agua.",
            modifier = modifier
                .padding(16.dp)
        )
        Button(
            onClick = { contador ++ },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("Tomate un vasito")
        }
    }
}
