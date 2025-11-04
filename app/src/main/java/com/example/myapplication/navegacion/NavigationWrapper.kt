package com.example.myapplication.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.componentes.*

@Composable
fun NavigationWrapper() {
    val navControlador = rememberNavController()

    NavHost(
        navController = navControlador,
        startDestination = "inicio"
    ) {
        composable("inicio") {
            Inicio { destino ->
                navControlador.navigate(destino)
            }
        }
        composable("alquileres") { Alquileres() }
        composable("entretenimiento") { Entretenimiento() }
        composable("gastronomia") { Gastronomia() }
        composable("parques") { Parques() }
        composable("playas") { Playas }
    }
}
