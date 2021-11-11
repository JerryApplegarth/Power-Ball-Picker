package com.fourapplecompose.powerballnumberpicker

sealed class Screen(val route: String) {

    object HomeScreen : Screen("home_screen")

    object PrintNumbers : Screen("print_numbers")
}
