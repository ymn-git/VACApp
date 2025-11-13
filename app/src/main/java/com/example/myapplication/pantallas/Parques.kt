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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.navegacion.Parques
import com.example.myapplication.navegacion.Inicio
import com.example.myapplication.pantallas.PantallaGenerica
import com.example.myapplication.componentes.TituloGenerico
import com.example.myapplication.componentes.SubtituloGenerico


/*
@Composable
fun Parques() {
    PantallaGenerica(imagenId = R.drawable.fondo_parques) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        TituloGenerico(texto = "Parques")
        Spacer(modifier = Modifier.height(16.dp))

        SubtituloGenerico(texto = "Naturaleza y aire libre")
        }
    }
}
*/


@Composable
fun Parques(navigate: (Any) -> Unit) {
    // Estado para mostrar info de parque seleccionado
    var parqueSeleccionado by remember { mutableStateOf<Parque?>(null) }

    PantallaGenerica(imagenId = R.drawable.fondo_parques) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            TituloGenerico(texto = "PARQUES", color = Color.White)
            Spacer(modifier = Modifier.height(8.dp))
            SubtituloGenerico(texto = "Naturaleza y aire libre", color = Color.White)
            Spacer(modifier = Modifier.height(16.dp))
            
            val parques = listOf(
                Parque("Bosque Energético", "RP 11", "24 hs", R.drawable.bosque_energetico, "Un entorno natural famoso por su energía misteriosa."),
                Parque("Parque de Los Patricios", "RP 11", "24 hs", R.drawable.parque_patricios, "Ideal para caminar y disfrutar del aire libre."),
                Parque("La Bienal", "RP 11", "7 a.m. - 19 p.m.", R.drawable.la_bienal, "Espacio cultural con arte al aire libre y actividades."),
                Parque("Vivero", "RP 11", "7 a.m. - 19 p.m.", R.drawable.vivero, "Lugar con mucha vegetación, ideal para pasear en familia."),
                //Parque("Paseo Costanera", "RP 11", "7 a.m. - 19 p.m.", R.drawable.paseo_costanera, "Senderos junto al mar con hermosas vistas.")
            )

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(parques) { parque ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { parqueSeleccionado = parque },
                        elevation = CardDefaults.cardElevation(6.dp),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Image(
                                painter = painterResource(parque.imagen),
                                contentDescription = parque.nombre,
                                modifier = Modifier
                                    .size(60.dp)
                                    .clip(RoundedCornerShape(8.dp)),
                                contentScale = ContentScale.Crop
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Column {
                                Text(parque.nombre, fontSize = 16.sp)
                                Text("Ubicación: ${parque.ubicacion}", fontSize = 13.sp)
                                Text("Horario: ${parque.horario}", fontSize = 13.sp)
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
        parqueSeleccionado?.let { parque ->
            AlertDialog(
                onDismissRequest = { parqueSeleccionado = null },
                title = { Text(parque.nombre) },
                text = { Text(parque.descripcion) },
                confirmButton = {
                    TextButton(onClick = { parqueSeleccionado = null }) {
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

// Modelo simple para cada parque
data class Parque(
    val nombre: String,
    val ubicacion: String,
    val horario: String,
    val imagen: Int,
    val descripcion: String
)