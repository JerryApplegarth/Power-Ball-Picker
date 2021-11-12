package com.fourapplecompose.powerballnumberpicker

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fourapplecompose.powerballnumberpicker.ui.theme.newBackgroundColor
import com.fourapplecompose.powerballnumberpicker.ui.theme.textItemTextColor


@Composable
fun PrintNumbers(
    navController: NavController
) {





     Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.newBackgroundColor),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

        Spacer(modifier = Modifier.height(16.dp))
        Text(

            text = stringResource(id = R.string.title),
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,
            color = MaterialTheme.colors.textItemTextColor
        )
        Text(
            modifier = Modifier.padding(16.dp),
            text = stringResource(R.string.body_text),
            fontSize = 16.sp
        )
        Text(
            text = stringResource(id = R.string.good_luck),
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))
        Text(
            modifier = Modifier.clickable {
                navController.navigate(route = Screen.HomeScreen.route)
            },
            text = "Click to Go Back",
            fontWeight = FontWeight.Bold
        )
        val firstNumbers = (1..69).random()
        val secondNumbers = ((1..69) - firstNumbers).random()
        val thirdNumbers = ((1..69) - firstNumbers - secondNumbers).random()
        val forthNumbers = ((1..69) - firstNumbers - secondNumbers
                - thirdNumbers).random()
        val fifthNumbers = ((1..69) - firstNumbers - secondNumbers
                - thirdNumbers - forthNumbers).random()
        val powerballNumber = ((1..26) - firstNumbers - secondNumbers
                - thirdNumbers - forthNumbers - fifthNumbers).random()
        val myLuckyNumber1: Int = firstNumbers
        val myLuckyNumber2: Int = secondNumbers
        val myLuckyNumber3: Int = thirdNumbers
        val myLuckyNumber4: Int = forthNumbers
        val myLuckyNumber5: Int = fifthNumbers
        val myPowerBall: Int = powerballNumber

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
        )
        {
            Text(
                modifier = Modifier.padding(8.dp),
                fontWeight = FontWeight.Bold,
                text = "$myLuckyNumber1,",
                fontSize = 24.sp,
            )
            Text(
                modifier = Modifier.padding(8.dp),
                fontWeight = FontWeight.Bold,
                text = "$myLuckyNumber2,",
                fontSize = 24.sp,
            )
            Text(
                text = myLuckyNumber3.toString(),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(8.dp),
            )
            Text(
                text = myLuckyNumber4.toString(),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(8.dp),
            )
            Text(
                text = myLuckyNumber5.toString(),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(8.dp),
            )
            Text(
                text = myPowerBall.toString(),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = MaterialTheme.colors.textItemTextColor,
                modifier = Modifier.padding(8.dp),
            )
        }
    }
}





