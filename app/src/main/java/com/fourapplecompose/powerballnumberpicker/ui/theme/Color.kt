package com.fourapplecompose.powerballnumberpicker.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFF85bb5c)
val Purple500 = Color(0xFF558b2f)
val Purple700 = Color(0xFF255d00)
val Teal200 = Color(0xFF03DAC5)



val LightGreen = Color(0xFFdcdec8)
val DarkGreen = Color(0xFF558b2f)

val RedOrange = Color(0xffffab91)
val RedPink = Color(0xfff48fb1)
val BabyBlue = Color(0xff81deea)
val Violet = Color(0xffcf94da)



val LightYellow = Color(0xfffffde7)

val LightGray = Color(0xfffcfcfc)
val MediumGray = Color(0xff9c9c9c)
val DarkGray = Color(0xff141414)

val LowPriorityColor = Color(0xFF00c980)
val MediumPriorityColor = Color(0xFFffc114)
val HighPriorityColor = Color(0xFFff4646)
val NonePriorityColor = MediumGray

val Green200 = Color(0xffcfff95)
val Green500 = Color(0xff9ccc65)
val Green700 = Color(0xff6b9b37)
val DarkGreen200 = Color(0xffaee571)
val DarkGreen500 = Color(0xff7cb342)
val DarkGreen700 = Color(0xff4b830d)


val FullWhite = Color(0xffffffff)
val FullBlack = Color(0xff000000)


val Colors.newBackgroundColor: Color
    @Composable
    get() = if (isLight) LightGreen else DarkGreen700


val Colors.taskItemTextColor: Color
    @Composable
    get() = if (isLight) FullBlack else DarkGreen500

val Colors.taskItemBackgroundColor: Color
    @Composable
    get() = if (isLight) Color.White else DarkGray

val Colors.fabBackgroundColor: Color
    @Composable
    get() = if (isLight) Green700 else DarkGreen700


val Colors.topAppBarContentColor: Color
    @Composable
    get() = if (isLight) FullBlack else FullWhite

val Colors.topAppBarBackgroundColor: Color
    @Composable
    get() = if (isLight) Green500 else DarkGreen500


