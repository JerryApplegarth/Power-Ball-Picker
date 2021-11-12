package com.fourapplecompose.powerballnumberpicker

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.fourapplecompose.powerballnumberpicker.ui.theme.DarkGreen700
import com.fourapplecompose.powerballnumberpicker.ui.theme.Purple700


enum class TabPage{
    HomeScreen, PrintNumbers
}


@Composable
fun Tab(

    icon:ImageVector,
    title:String,
    onClick:() -> Unit,
    modifier: Modifier = Modifier
) {
    Row(modifier = Modifier
        .clickable(onClick = onClick)
        .padding(16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Icon(
            imageVector = icon,
            contentDescription = null)
        
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = title, color = Color.White )

    }
}

@Composable
private fun TabIndicator(
    tabPositions: List<TabPosition>,
    tabPage: TabPage
) {

    
}

@Composable
private fun TabBar(
    backGroundColor:Color,
    tabPage: TabPage,
    onTabSelected:(tabPage: TabPage) -> Unit

) {
    TabRow(selectedTabIndex = tabPage.ordinal,
    backgroundColor = backGroundColor,
    indicator = {tabPositions ->  TabIndicator(
        tabPositions, tabPage)}) {
        Tab(icon = Icons.Default.Home,
            title = "Home",
            onClick = { onTabSelected(TabPage.HomeScreen) })
        Tab(icon = Icons.Default.AccountBox,
            title = "Print Numbers",
            onClick = { onTabSelected(TabPage.PrintNumbers) })


    }

}

@Composable
fun Main() {
    var tabPage by remember {
        mutableStateOf(TabPage.HomeScreen) }
    val backGroundColor = if (tabPage == TabPage.HomeScreen ) DarkGreen700
    else Purple700

    Scaffold(
        topBar = {
            TabBar(
            backGroundColor = backGroundColor,
            tabPage = tabPage,
            onTabSelected = { tabPage = it })
        }
    ) {

    }
}














