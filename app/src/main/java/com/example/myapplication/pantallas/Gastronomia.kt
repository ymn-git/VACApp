package com.example.myapplication.componentes

import android.graphics.drawable.Drawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.navegacion.Gastronomia
import com.example.myapplication.navegacion.Inicio
import com.example.myapplication.pantallas.PantallaGenerica
@Composable
fun Gastronomia(navigate: (Any) -> Unit) {
    var gastronomiaSeleccionada by remember { mutableStateOf<Parque?>(null) }

    PantallaGenerica(imagenId = R.drawable.foto_comidas) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            TituloGenerico(texto = "Gastronomia", color = Color.White, fontSize = 40)
            
            Spacer(modifier = Modifier.height(8.dp))
            SubtituloGenerico(texto = "Descubre distintos rubros", color = Color.White)
            Spacer(modifier = Modifier.height(16.dp))

            val gastronomias = listOf(
                Parque("Nanni", "Av 9 y 32", "19:00 a 00:00", R.drawable.nanni, "Restaurante."),
                Parque("Las Moras", "Av 26 1035", "19:00 a 00:00", R.drawable.lasmoras, "Restaurante"),
                Parque("Fortunato", "21 1458", "19:00 a 00:00", R.drawable.fortunato, "Restaurante"),
                Parque("Gaviotas", "21 1109", "7 a.m. - 19 p.m.", R.drawable.gaviotas, "Restaurante"),
                //Parque("Paseo Costanera", "RP 11", "7 a.m. - 19 p.m.", R.drawable.paseo_costanera, "Senderos junto al mar con hermosas vistas.")
            )

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(gastronomias) { gastronomia ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { gastronomiaSeleccionada = gastronomia },
                        elevation = CardDefaults.cardElevation(6.dp),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Image(
                                painter = painterResource(gastronomia.imagen),
                                contentDescription = gastronomia.nombre,
                                modifier = Modifier
                                    .size(60.dp)
                                    .clip(RoundedCornerShape(8.dp)),
                                contentScale = ContentScale.Crop
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Column {
                                Text(gastronomia.nombre, fontSize = 16.sp)
                                Text("Ubicación: ${gastronomia.ubicacion}", fontSize = 13.sp)
                                Text("Horario: ${gastronomia.horario}", fontSize = 13.sp)
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            // Un solo botón volver, al final
            BotonGenerico("Volver") { navigate(Inicio) }
        }

        // Popup con info del parque seleccionado
        gastronomiaSeleccionada?.let { gastronomia ->
            AlertDialog(
                onDismissRequest = { gastronomiaSeleccionada = null },
                title = { Text(gastronomia.nombre) },
                text = { Text(gastronomia.descripcion) },
                confirmButton = {
                    TextButton(onClick = { gastronomiaSeleccionada = null }) {
                        Text(text = "Cerrar")
                    }
                }
            )
        }
    }
}

@Composable
fun BotonGastronomia(texto: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(
            text = texto,
            fontSize = 16.sp,
            color = Color.White
        )
    }
}
data class Gastronomia(
    val nombre: String,
    val ubicacion: String,
    val horario: String,
    val imagen: Int,
    val descripcion: String
)