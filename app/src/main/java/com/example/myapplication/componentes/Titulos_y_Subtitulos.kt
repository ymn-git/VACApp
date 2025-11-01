package com.example.myapplication.componentes

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import com.example.myapplication.R
val notableFont = FontFamily(Font(R.font.notable_font))

@Composable
fun TituloGenerico(
    texto: String,
    fontSize: Int = 48,
    color: Color = Color.Black
) {
    Text(
        text = texto,
        fontSize = fontSize.sp,
        fontFamily = notableFont,
        color = color
    )
}

@Composable
fun SubtituloGenerico(
    texto: String,
    fontSize: Int = 20,
    color: Color = Color.Black
) {
    Text(
        text = texto,
        fontSize = fontSize.sp,
        fontFamily = notableFont,
        color = color
    )
}
