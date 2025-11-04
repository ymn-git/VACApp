package com.example.myapplication.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.CardWhite
import com.example.myapplication.ui.theme.TextBlack

@Composable
fun CardInfo(
    titulo: String,
    descripcion: String,
    imagenId: Int
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .background(
                color = CardWhite,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(16.dp)
    ) {
        Text(text = titulo, fontSize = 20.sp, color = TextBlack)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = descripcion, fontSize = 16.sp, color = TextBlack)
    }
}
