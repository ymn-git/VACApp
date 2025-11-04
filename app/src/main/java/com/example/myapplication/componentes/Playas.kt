package com.example.myapplication.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun Playas(onVolverClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) {
        // Fondo general
        Image(
            painter = painterResource(id = R.drawable.foto_playa),
            contentDescription = "Fondo playa",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
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
                        .padding(all = 4.dp)
                        .clickable { onVolverClick() }
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Título
            Text(
                text = "PLAYAS",
                color = Color.White,
                fontSize = 36.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            // Cards con imagen + texto
            CardPlaya(R.drawable.playa_sanantonio, "San Antonio", "Ubicación: BP 11", "Horario: 7 a.m - 19 p.m")
            CardPlaya(R.drawable.playa_cacho, "Cacho", "Ubicación: BP 11", "Horario: 7 a.m - 19 p.m")
            CardPlaya(R.drawable.playa_coral, "Coral", "Ubicación: BP 11", "Horario: 7 a.m - 19 p.m")
            CardPlaya(R.drawable.playa_hr, "H&R", "Ubicación: BP 11", "Horario: 7 a.m - 19 p.m")
            CardPlaya(R.drawable.playa_rockaway, "RockAway", "Ubicación: BP11 1950 (ex bajada)", "Horario: 7 a.m - 19 p.m")
        }
    }
}

@Composable
fun CardPlaya(
    imagenId: Int,
    nombre: String,
    ubicacion: String,
    horario: String
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
            .background(Color.White.copy(alpha = 0.9f), shape = RoundedCornerShape(16.dp))
            .padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = imagenId),
                contentDescription = nombre,
                modifier = Modifier
                    .size(60.dp)
                    .padding(4.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(
                    text = nombre,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Text(text = ubicacion, color = Color.Black, fontSize = 13.sp)
                Text(text = horario, color = Color.Black, fontSize = 13.sp)
            }
            // Botón de Info
            Box(
                modifier = Modifier
                    .background(Color(0xFFEFEFEF), RoundedCornerShape(12.dp))
                    .padding(horizontal = 10.dp, vertical = 6.dp)
            ) {
                Text(
                    text = "Info",
                    color = Color.Black,
                    fontSize = 13.sp,
                )
            }
        }
    } }


@Preview
@Composable
fun PlayasPreview() {
    Playas(onVolverClick = { })
}