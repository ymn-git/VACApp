package com.example.myapplication.navegacion

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.pantallas.PantallaGenerica

// PANTALLA DE PARQUES
@Composable
fun Parques() {
    PantallaGenerica(imagenId = R.drawable.fondo_parques) {
        // Contenido centrado sobre el fondo
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Parques de Miramar",
                fontSize = 32.sp,
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Explorá los espacios verdes ideales para disfrutar la naturaleza 🌳",
                fontSize = 18.sp
            )
        }
    }
}

// PREVIEW
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ParquesPreview() {
    Parques()
}
