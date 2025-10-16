package com.example.med_info.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val PrimaryMedis = Color(0xFF4CAF50)
val SecondaryMedis = Color(0xFF8BC34A)
val BackgroundPutih = Color(0xFFF9F9F9)
val OnPrimary = Color.White
val SurfaceColor = Color.White
val OnSurfaceColor = Color(0xFF1C1B1F)

val LightColorSchemeKustom = lightColorScheme(
    primary = PrimaryMedis,
    onPrimary = OnPrimary,
    secondary = SecondaryMedis,
    background = BackgroundPutih,
    surface = SurfaceColor,
    onSurface = OnSurfaceColor
)
val DarkColorSchemeKustom = darkColorScheme(
    primary = SecondaryMedis,
    onPrimary = OnPrimary,
)