package com.example.myapplication.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.navegacion.Alquileres
import com.example.myapplication.navegacion.Entretenimiento
import com.example.myapplication.navegacion.Gastronomia
import com.example.myapplication.navegacion.Parques
import com.example.myapplication.navegacion.Playas
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.myapplication.componentes.BotonDeNavegacion
import com.example.myapplication.componentes.FondoDePantalla


//------------------------------------------------------------------------------------:
//CODIGO PARA EL EMULADOR
@Composable
fun Inicio(navigate: (Any) -> Unit) {
    Box {
        FondoDePantalla(imagenId = R.drawable.fondo_pantalla)

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "LogoVacApp",
                modifier = Modifier.size(120.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.height(20.dp))
            TituloGenerico("VACAPP")
            Spacer(modifier = Modifier.height(16.dp))
            SubtituloGenerico("Vacaciones en Miramar")
            Spacer(modifier = Modifier.height(24.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    BotonDeNavegacion(R.drawable.iconhotel, "Alquileres") { navigate(Alquileres) }
                    BotonDeNavegacion(R.drawable.iconcomida, "Gastronomía") { navigate(Gastronomia) }
                    BotonDeNavegacion(R.drawable.iconplaya, "Playas") { navigate(Playas) }
                }


                Column(
                    verticalArrangement = Arrangement.spacedBy(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    BotonDeNavegacion(R.drawable.iconpop, "Entretenimiento") { navigate(Entretenimiento) }
                    BotonDeNavegacion(R.drawable.iconforest, "Parques") { navigate(Parques) }
                }
            }

            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}
//--------------------------------------------------------------------------------------:

//------------------------------------------------------------------------------------:
