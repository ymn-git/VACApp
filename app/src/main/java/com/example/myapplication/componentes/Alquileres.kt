package com.example.myapplication.componentes

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.clickable
import com.example.myapplication.R
import com.example.myapplication.pantallas.PantallaGenerica

@Composable
fun Alquileres(onVolverClick: () -> Unit = {}) {
    PantallaGenerica(imagenId = R.drawable.foto_alquileres) {
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
            TituloGenerico(texto = "ALQUILERES", color = Color.White, fontSize = 10 )

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item {
                    CardInfo(
                        titulo = "miramarinmobiliaria.com",
                        descripcion = "Alquileres por dueño directo",
                        imagenId = R.drawable.foto_alquileres
                    )
                }
                item {
                    CardInfo(
                        titulo = "Turingia",
                        descripcion = "Ubicación: 28 1080\nHorario: 8 a.m - 11:30 p.m",
                        imagenId = R.drawable.foto_alquileres
                    )
                }
                item {
                    CardInfo(
                        titulo = "Costanera",
                        descripcion = "Ubicación: Costanera 1371\nHorario: 19 p.m - 03:00 p.m",
                        imagenId = R.drawable.foto_alquileres
                    )
                }
                item {
                    CardInfo(
                        titulo = "Brisas",
                        descripcion = "Ubicación: Calle 29 257\nHorario: 19 p.m - 03:00 p.m",
                        imagenId = R.drawable.foto_alquileres
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AlquileresPreview() {
    Alquileres()
}
