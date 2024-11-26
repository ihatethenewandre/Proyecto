package com.jatinvashisht.letscookit.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
//    primary = Color(0xffc52427),
    primary = Color(0xFF129575),
    primaryVariant = Color(0xffe8cd15),
    secondary = Color(0xffe8cd15),
//    surface = Color(0xff68b02b),
    surface = Color(0xFF129574),
    background = Color(0xFF129575),
    onSurface = Color(0xFFFFFFFF),
//    onSurface = Color(0xFFB2EBF2),

)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun LetsCookItTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = DarkColorPalette
    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}