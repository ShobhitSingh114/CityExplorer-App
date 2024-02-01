package com.example.cityexplorerapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.cityexplorerapp.datasource.DataSource
import com.example.cityexplorerapp.ui.CityScreen

// TODO: Screeon enum

// TODO: APP bar composable
@Composable
fun CityExplorerApp() {
    // TODO: create navController and VM

    // TODO: scaffold(topBar) { NavHost }

    LazyColumn{
        items(DataSource.cities){
            CityScreen(
                cityDetails = it,
                onCardClicked = {}
            )
        }
    }
}

//@Preview(showSystemUi = true)
//@Composable
//fun Abc() {
//    CityExplorerApp()
//}
