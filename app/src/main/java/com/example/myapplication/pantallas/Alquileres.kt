package com.example.myapplication.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.navegacion.Inicio
import com.example.myapplication.componentes.TituloGenerico
import com.example.myapplication.componentes.SubtituloGenerico
import com.example.myapplication.navegacion.Alquileres

@Composable
fun Alquileres(navigate: (Any) -> Unit) {
    // Estado para mostrar info de hotel seleccionado
    var hotelSeleccionado by remember { mutableStateOf<Hotel?>(null) }

    PantallaGenerica(imagenId = R.drawable.foto_alquileres) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            TituloGenerico(texto = "HOTELES")
            Spacer(modifier = Modifier.height(8.dp))
            SubtituloGenerico(texto = "Alojamiento y confort")
            Spacer(modifier = Modifier.height(16.dp))

            val hoteles = listOf(
                Hotel(
                    "Miramar inmobiliario",
                    "Centro",
                    "24 hs",
                    R.drawable.miramarinmobiliario,
                    "Hotel de lujo con vista al lago y todas las comodidades."
                ),
                Hotel(
                    "Hotel Turingia",
                    "Costanera",
                    "24 hs",
                    R.drawable.turingia,
                    "Excelente ubicación frente al lago con servicios premium."
                ),
                Hotel(
                    "Hostería costanera",
                    "Zona Alta",
                    "24 hs",
                    R.drawable.costanera,
                    "Alojamiento familiar con vista panorámica de la ciudad."
                ),
                Hotel(
                    "Hotel brisas",
                    "San Roque",
                    "24 hs",
                    R.drawable.brisas,
                    "Apartamentos totalmente equipados para estancias prolongadas."
                )
            )

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(hoteles) { hotel ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { hotelSeleccionado = hotel },
                        elevation = CardDefaults.cardElevation(6.dp),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Image(
                                painter = painterResource(hotel.imagen),
                                contentDescription = hotel.nombre,
                                modifier = Modifier
                                    .size(60.dp)
                                    .clip(RoundedCornerShape(8.dp)),
                                contentScale = ContentScale.Crop
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Column {
                                Text(hotel.nombre, fontSize = 16.sp)
                                Text("Ubicación: ${hotel.ubicacion}", fontSize = 13.sp)
                                Text("Recepción: ${hotel.horario}", fontSize = 13.sp)
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            BotonGenerico("Volver") { navigate(Inicio) }
        }

        // Popup con info del hotel seleccionado
        hotelSeleccionado?.let { hotel ->
            AlertDialog(
                onDismissRequest = { hotelSeleccionado = null },
                title = { Text(hotel.nombre) },
                text = { Text(hotel.descripcion) },
                confirmButton = {
                    TextButton(onClick = { hotelSeleccionado = null }) {
                        Text(text = "Cerrar")
                    }
                }
            )
        }
    }
}

@Composable
fun BotonGenerico(texto: String, onClick: () -> Unit) {
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

// Modelo simple para cada hotel
data class Hotel(
    val nombre: String,
    val ubicacion: String,
    val horario: String,
    val imagen: Int,
    val descripcion: String
)
