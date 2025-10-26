package com.example.myapplication.componentes

import android.graphics.drawable.Drawable
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
import androidx.compose.foundation.layout.width
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

val notableFont = FontFamily(Font(R.font.notable_font))

//------------------------------------------------------------------------------------:
//CODIGO PARA EL EMULADOR
@Composable
fun Inicio(navigate: (Any) -> Unit) {
    Box {
        FondoDePantalla()
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
            Titulo()
            Spacer(modifier = Modifier.height(16.dp))
            Subtitulo()
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
//------------------------------------------------------------------------------------:
// CODIGO PARA LA PREVIEW
@Preview
@Composable
fun Vista() {
    Box{
        FondoDePantalla()
        Column( modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally)
        {
            Titulo()
            Spacer(modifier = Modifier.height(24.dp))
            Subtitulo()
            Spacer(modifier = Modifier.height(25.dp))
        }
    }
}
//--------------------------------------------------------------------------------------:
//FUNCIONES GENERALES

@Composable
fun BotonDeNavegacion(iconoId: Int, texto: String, onClickDestino: () -> Unit) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        FloatingActionButton(
            onClick = onClickDestino,
            modifier = Modifier.size(80.dp),
            containerColor = Color.White
        ) {
            Image(
                painter = painterResource(id = iconoId),
                contentDescription = texto,
                modifier = Modifier.size(50.dp),
                contentScale = ContentScale.Fit
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Box(
            modifier = Modifier
                .background(Color.White, shape = RoundedCornerShape(6.dp))
                .padding(horizontal = 2.dp, vertical = 2.dp)
        ) {
            Text(
                text = texto,
                fontSize = 12.sp,
                color = Color.Black
            )
        }
    }
}


@Composable
fun FondoDePantalla(){
            Image(
                painter = painterResource(id = R.drawable.fondo_pantalla),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
}
@Composable
fun Titulo(){
    Text("VACAPP", fontSize = 48.sp, fontFamily = notableFont)
}
@Composable
fun Subtitulo(){
    Text(text = "Vacaciones en Miramar", fontSize = 20.sp, fontFamily = notableFont)
}