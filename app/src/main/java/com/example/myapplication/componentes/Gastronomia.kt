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
import com.example.myapplication.componentes.notableFont
import com.example.myapplication.pantallas.PantallaGenerica

// PANTALLA DE GASTRONOMÍA
@Composable
fun Gastronomia(onVolverClick: () -> Unit = {}) {
    PantallaGenerica(imagenId = R.drawable.foto_comidas) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Gastronomía",
                fontSize = 59.sp,
                fontFamily = notableFont


            )
            Spacer(modifier = Modifier.height(100.dp))
            
            Text(
                text = "Proximamente 🍽️",
                fontSize = 38.sp,
                fontFamily = notableFont
            )
        }
    }
}

// PREVIEW
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GastronomiaPreview() {
    Gastronomia()
}
