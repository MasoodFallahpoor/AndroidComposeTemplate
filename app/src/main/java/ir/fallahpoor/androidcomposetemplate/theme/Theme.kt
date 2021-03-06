package ir.fallahpoor.androidcomposetemplate.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val lightColors: Colors = lightColors(
    primary = Magenta,
    primaryVariant = Blue,
    onPrimary = White,
    secondary = Teal,
    onSecondary = Black,
    error = LightRed
)

private val darkColors: Colors = darkColors(
    primary = Teal,
    primaryVariant = Black,
    onPrimary = Black,
    secondary = Teal,
    onSecondary = Black,
    error = DarkRed
)

@Composable
fun AndroidComposeTemplateTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) darkColors else lightColors,
        content = content
    )
}