val customTypography = Typography(
    defaultFontFamily = customFontFamily,
    h1 = TextStyle(
        fontSize = TextUnit(20f, TextUnitType.Sp),
        fontWeight = FontWeight.Bold
    ),
    h2 = TextStyle(
        fontSize = TextUnit(18f, TextUnitType.Sp),
        fontWeight = FontWeight.Normal,
        color = Color.Blue
    ),
    // ... etc.
)
...
MaterialTheme(
    typography = customTypography
) { ... }
