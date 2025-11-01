package com.example.myapplication.navegacion

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

//------------------------------------------------------------------------------------
// FUENTE (igual que en Inicio)
val notableFont = FontFamily(Font(R.font.notable_font))

//------------------------------------------------------------------------------------
// PANTALLA DE PLAYAS
@Composable
fun Playas() {
    Box(modifier = Modifier.fillMaxSize()) {
        // Imagen de fondo
        Image(
            painter = painterResource(id = R.drawable.playa),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // Contenido centrado
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Playas de Miramar",
                fontSize = 32.sp,
                fontFamily = notableFont
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Encontrá las mejores playas para disfrutar del verano miramarense ☀️",
                fontSize = 18.sp
            )
        }
    }
}

//------------------------------------------------------------------------------------
// PREVIEW
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PlayasPreview() {
    Playas()
}
