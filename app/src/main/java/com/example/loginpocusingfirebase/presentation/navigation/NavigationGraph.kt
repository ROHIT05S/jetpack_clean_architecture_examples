package com.example.loginpocusingfirebase.presentation.navigation

sealed class NavigationGraph(val route: String) {
    data object LoginScreen : NavigationGraph(route = "login_screen")
    data object RegisterScreen : NavigationGraph(route = "register_screen")
    data object HomeScreen : NavigationGraph(route = "home_screen")
}