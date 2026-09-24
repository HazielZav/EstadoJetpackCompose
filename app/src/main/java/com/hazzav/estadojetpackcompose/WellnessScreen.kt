package com.hazzav.estadojetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WellnsessScreen(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .padding(top = 16.dp)
    ) {
        StatefulCounter()

        val list = remember {
            getWellnessTasks().toMutableList()
        }
        WellnessTasksList(lista = list, onCloseTask = { task -> list.remove(task) })
    }
}

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }