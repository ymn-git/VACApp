package com.example.myapplication.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.componentes.*
import com.example.myapplication.pantallas.Alquileres


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
        composable <Alquileres> {
            Alquileres { destino -> navControlador.navigate(destino) }
        }
        composable <Entretenimiento> { Entretenimiento() }
        composable <Gastronomia> { Gastronomia{ destino -> navControlador.navigate(destino)} }
        composable<Parques> {
            Parques { destino -> navControlador.navigate(destino) }
        }
        composable <Playas> { Playa { destino -> navControlador.navigate(destino)} }
    }
}
