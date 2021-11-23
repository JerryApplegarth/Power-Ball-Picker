package com.fourapplecompose.powerballnumberpicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.fourapplecompose.powerballnumberpicker.ui.theme.newBackgroundColor

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme.colors.newBackgroundColor

            navController = rememberNavController()
            SetUpNavigation(navController = navController)
        }
    }
}


