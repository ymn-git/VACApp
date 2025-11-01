package com.example.myapplication.pantallas

import androidx.compose.foundation.layout.Box
import com.example.myapplication.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.myapplication.componentes.FondoDePantalla

@Composable
fun PantallaGenerica(
    imagenId: Int,
    contenido: @Composable () -> Unit = {}
) {
    Box {
        FondoDePantalla(imagenId = imagenId)
        contenido()
    }
}
