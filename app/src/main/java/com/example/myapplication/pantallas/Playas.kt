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
import com.example.myapplication.navegacion.Inicio
import com.example.myapplication.navegacion.Playas
import com.example.myapplication.pantallas.PantallaGenerica

@Composable
fun Playa(navigate: (Any) -> Unit) {
    var playaSeleccionada by remember { mutableStateOf<Playa?>(null) }

    PantallaGenerica(imagenId = R.drawable.foto_playa) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            TituloGenerico(texto = "Playas", color = Color.White)

            Spacer(modifier = Modifier.height(8.dp))
            SubtituloGenerico(texto = "Descubre nuestras playas", color = Color.White)
            Spacer(modifier = Modifier.height(16.dp))

            val playas = listOf(
                Playa("Rockaway", "Ruta 11", "19:00 a 00:00", R.drawable.playa2, "Tranquilidad y naturaleza en una playa poco concurrida."),
                Playa("Cacho", "Ruta 11", "19:00 a 00:00", R.drawable.playa3, "Ideal para disfrutar del sol, el mar y la vida urbana."),
                Playa("Coral", "Ruta 11", "19:00 a 00:00", R.drawable.playa4, "Ambiente familiar con aguas calmas y arena suave."),
                Playa("Chicama", "Ruta 11", "7 a.m. - 19 p.m.", R.drawable.playaa, "Paisaje único con formaciones rocosas y vistas espectaculares."),
                Playa("Playa Mar del Sud", "RP 11", "24 hs", R.drawable.foto_playa, "Encanto rústico y olas perfectas para surfear.")

            )

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(playas) { playa ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { playaSeleccionada = playa },
                        elevation = CardDefaults.cardElevation(6.dp),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Image(
                                painter = painterResource(playa.imagen),
                                contentDescription = playa.nombre,
                                modifier = Modifier
                                    .size(60.dp)
                                    .clip(RoundedCornerShape(8.dp)),
                                contentScale = ContentScale.Crop
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Column {
                                Text(playa.nombre, fontSize = 16.sp)
                                Text("Ubicación: ${playa.ubicacion}", fontSize = 13.sp)
                                Text("Horario: ${playa.horario}", fontSize = 13.sp)
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
        playaSeleccionada?.let { playa ->
            AlertDialog(
                onDismissRequest = { playaSeleccionada = null },
                title = { Text(playa.nombre) },
                text = { Text(playa.descripcion) },
                confirmButton = {
                    TextButton(onClick = { playaSeleccionada = null }) {
                        Text(text = "Cerrar")
                    }
                }
            )
        }
    }
}

@Composable
fun BotonPlaya(texto: String, onClick: () -> Unit) {
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
data class Playa(
    val nombre: String,
    val ubicacion: String,
    val horario: String,
    val imagen: Int,
    val descripcion: String
)