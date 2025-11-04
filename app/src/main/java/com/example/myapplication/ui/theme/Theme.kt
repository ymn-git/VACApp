package com.example.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.myapplication.R

// 🎨 Colores principales del diseño
val PurpleGradientStart = Color(0xFF6A00FF)
val PurpleGradientEnd = Color(0xFF2D00A8)

val CardWhite = Color.White
val TextWhite = Color.White
val TextBlack = Color.Black
val OverlayDark = Color(0x66000000) // negro 40% opacidad

// 🔤 Fuente principal
val NotableFont = FontFamily(Font(R.font.notable_font))

// 🧩 Tipografía global
val AppTypography = Typography(
    displayLarge = TextStyle(fontFamily = NotableFont),
    bodyLarge = TextStyle(fontFamily = NotableFont)
)

// 🌙 Tema general de la app
@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = androidx.compose.material3.lightColorScheme(
            primary = PurpleGradientStart,
            secondary = PurpleGradientEnd,
            background = Color.White,
            surface = Color.White,
            onPrimary = TextWhite,
            onSecondary = TextWhite,
            onBackground = TextBlack,
            onSurface = TextBlack
        ),
        typography = AppTypography,
        content = content
    )
}
