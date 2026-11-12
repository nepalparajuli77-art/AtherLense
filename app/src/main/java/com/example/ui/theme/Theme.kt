package com.example.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val AetherColorScheme = darkColorScheme(
    primary = CyberCyan,
    onPrimary = ObsidianBackground,
    primaryContainer = Color(0xFF003847),
    onPrimaryContainer = Color(0xFF99F7FF),
    secondary = AmberGold,
    onSecondary = ObsidianBackground,
    secondaryContainer = Color(0xFF452E00),
    onSecondaryContainer = Color(0xFFFFDF9E),
    tertiary = SkyPulse,
    onTertiary = ObsidianBackground,
    background = ObsidianBackground,
    onBackground = TextPrimary,
    surface = ObsidianSurface,
    onSurface = TextPrimary,
    surfaceVariant = ObsidianSurfaceVariant,
    onSurfaceVariant = TextSecondary,
    outline = ObsidianBorder
)

@Composable
fun AetherLensTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = AetherColorScheme,
        typography = AppTypography,
        content = content
    )
}
