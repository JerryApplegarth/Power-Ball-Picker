package com.fourapplecompose.powerballnumberpicker

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetUpNavigation(
    navController: NavHostController

) {


    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ){
        composable(
            route = Screen.HomeScreen.route
        ){
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.PrintNumbers.route
        ){
            PrintNumbers(navController = navController)
        }


    }
}