package com.hazzav.estadojetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
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
        var contador by rememberSaveable { mutableStateOf(0) }

        if (contador > 0) {
            //var mostrarTarea by remember { mutableStateOf(true)}
//            if (mostrarTarea){
//                WellnessTaskItem(
//                    onClose = { mostrarTarea = false },
//                    taskName = "¿Ya hiciste tu caminata de 15 minutos hoy?"
//                )
//            }
            Text(
                text = "Has tomado $contador vasos de agua.",
                modifier = modifier
                    .padding(16.dp)
            )
        } else {
            Text(
                text = "¡Aún no has tomado agua!",
                modifier = modifier
                    .padding(16.dp)
            )
        }
        Row(
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Button(
                onClick = { contador ++ },
                enabled = contador < 10,
            ) {
                Text("Tomate un vasito")
            }
//            Button(
//                onClick = { contador = 0 },
//                Modifier.padding(start = 8.dp)
//            ) {
//                Text("Reiniciar conteo.")
//            }
        }
    }
}
