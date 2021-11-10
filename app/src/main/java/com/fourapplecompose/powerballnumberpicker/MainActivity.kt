package com.fourapplecompose.powerballnumberpicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fourapplecompose.powerballnumberpicker.ui.theme.TestingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestingTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    PrintNumbers()

                }
            }
        }
    }
}

@Composable
fun PrintNumbers() {



    Column (modifier = Modifier
        .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ){
        Spacer(modifier = Modifier.height(16.dp))
        Text(

            text = "Your Lucky Numbers",
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp

        )
        Text(modifier = Modifier.padding(16.dp),
            text = "Everytime you open this app, " +
                    "you will be shown your next lucky Power Ball number.\n" +
                    "You will not win every time but " +
                    "it's a new way to play-Let the app pick your numbers.",

            fontSize = 16.sp
        )

        Text(text = "GoodLuck!!!",
            modifier = Modifier.padding(16.dp),
            fontSize = 16.sp
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
                modifier = Modifier
                    .padding(8.dp),
                text = "$myLuckyNumber1,",
                fontSize = 24.sp,

                )
            Text(
                modifier = Modifier
                    .padding(8.dp),
                text = "$myLuckyNumber2,",
                fontSize = 24.sp,

                )
            Text(
                text = myLuckyNumber3.toString(),
                fontSize = 24.sp,
                modifier = Modifier.padding(8.dp),
            )

            Text(
                text = myLuckyNumber4.toString(),
                fontSize = 24.sp,
                modifier = Modifier.padding(8.dp),
            )

            Text(
                text = myLuckyNumber5.toString(),
                fontSize = 24.sp,
                modifier = Modifier.padding(8.dp),

                )
            Text(
                text = myPowerBall.toString(),
                fontSize = 24.sp,
                color = Color.Red,
                modifier = Modifier.padding(8.dp),
            )
        }


    }

}

