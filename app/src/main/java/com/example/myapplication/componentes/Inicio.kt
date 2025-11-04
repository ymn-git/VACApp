package com.example.myapplication.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.navegacion.Alquileres
import com.example.myapplication.navegacion.Entretenimiento
import com.example.myapplication.navegacion.Gastronomia
import com.example.myapplication.navegacion.Parques
import com.example.myapplication.navegacion.Playas
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.clickable



@Composable
fun Inicio(navigate: (Any) -> Unit = {}) {
    Box {
        // Fondo de pantalla
        FondoDePantalla(imagenId = R.drawable.fondo_pantalla)

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo VacApp",
                modifier = Modifier.size(120.dp),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(20.dp))
            TituloGenerico("VACAPP")
            Spacer(modifier = Modifier.height(8.dp))
            SubtituloGenerico("Vacaciones en Miramar")
            Spacer(modifier = Modifier.height(24.dp))

            // Botones distribuidos en 2 columnas
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Boton(
                        texto = "Alquileres",
                        iconoId = R.drawable.iconhotel,
                        onClickDestino = { navigate(Alquileres) }
                    )
                    Boton(
                        texto = "Gastronomía",
                        iconoId = R.drawable.iconcomida,
                        onClickDestino = { navigate(Gastronomia) }
                    )
                    Boton(
                        texto = "Playas",
                        iconoId = R.drawable.iconplaya,
                        onClickDestino = { navigate(Playas) }
                    )
                }

                Column(
                    verticalArrangement = Arrangement.spacedBy(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Boton(
                        texto = "Entretenimiento",
                        iconoId = R.drawable.iconpop,
                        onClickDestino = { navigate(Entretenimiento) }
                    )
                    Boton(
                        texto = "Parques",
                        iconoId = R.drawable.iconforest,
                        onClickDestino = { navigate(Parques) }
                    )
                }
            }

            Spacer(modifier = Modifier.height(30.dp))
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
}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InicioPreview() {
    Inicio()
}
