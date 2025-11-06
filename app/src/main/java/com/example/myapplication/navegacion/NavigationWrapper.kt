package com.example.myapplication.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.navegacion.*
import com.example.myapplication.componentes.*

@Composable
fun NavigationWrapper()
{
    val navControlador = rememberNavController()

    NavHost(navController=navControlador, startDestination=Inicio)
    {
        composable <Inicio>
        {
            Inicio {
                    destino -> navControlador.navigate(destino)
            }
        }
        composable <Alquileres> { Alquileres() }
        composable <Entretenimiento> { Entretenimiento() }
        composable <Gastronomia> { Gastronomia() }
        composable<Parques> {
            Parques { destino -> navControlador.navigate(destino) }
        }
        composable <Playas> { Playas() }
    }
}
