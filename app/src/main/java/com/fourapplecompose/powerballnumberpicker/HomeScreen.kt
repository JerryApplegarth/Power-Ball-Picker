package com.fourapplecompose.powerballnumberpicker

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fourapplecompose.powerballnumberpicker.ui.theme.newBackgroundColor
import com.fourapplecompose.powerballnumberpicker.ui.theme.textItemTextColor

@Composable
fun HomeScreen(navController: NavController) {





    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.newBackgroundColor),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {




        Text(
            modifier = Modifier
                .padding(start = 8.dp),



            text = stringResource(id = R.string.home_page_text),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.textItemTextColor
        )
        Spacer(modifier = Modifier.height(36.dp))
        Text(

            modifier = Modifier
                .padding(start = 8.dp)
                .clickable {
                    navController.navigate(route = Screen.PrintNumbers.route)

                },

            text = stringResource(id = R.string.click),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold

            )


    }



}

