package com.example.myapplication.navegacion

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.WhitePoint
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.componentes.TituloGenerico
import com.example.myapplication.componentes.notableFont
import com.example.myapplication.pantallas.PantallaGenerica

// PANTALLA DE ENTRETENIMIENTO
@Composable
fun Entretenimiento(onVolverClick: () -> Unit = {}) {
    PantallaGenerica(imagenId = R.drawable.foto_helados) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 14.dp, vertical = 22.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Botón "Volver"
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, top = 8.dp),
                contentAlignment = Alignment.TopStart
            ) {
                Text(
                    text = "Volver",
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(4.dp)
                        .clickable { onVolverClick() }
                )
            }

            Spacer(modifier = Modifier.height(23.dp))

            // Título
            TituloGenerico(texto = "ENTRETENIMIENTO", color = Color.White, fontSize = 40 )

            Spacer(modifier = Modifier.height(100.dp))

            Text(
                text = "Proximamente",
                fontSize = 35.sp,
                fontFamily = notableFont,

            )
        }
    }
}

// PREVIEW
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun EntretenimientoPreview() {
    Entretenimiento()
}
