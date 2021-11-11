package com.fourapplecompose.powerballnumberpicker

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.fourapplecompose.powerballnumberpicker.ui.theme.topAppBackgroundColor

@Composable
fun TopAppBar() {
    Scaffold(

    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.topAppBackgroundColor)
        ) {

        }
        TopAppBar(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.topAppBackgroundColor)


        ) {

            Text(
                text = "Power Ball Numbers",
                style = MaterialTheme
                    .typography.h4,

                color = Color.Black,
                fontSize = 20.sp,
                maxLines = 1,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
    TopAppBar()
}


