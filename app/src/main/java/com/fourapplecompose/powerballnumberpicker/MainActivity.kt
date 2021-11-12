package com.fourapplecompose.powerballnumberpicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.fourapplecompose.powerballnumberpicker.ui.theme.newBackgroundColor
import com.fourapplecompose.powerballnumberpicker.ui.theme.textItemTextColor

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


