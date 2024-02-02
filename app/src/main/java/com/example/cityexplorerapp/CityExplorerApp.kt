package com.example.cityexplorerapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.cityexplorerapp.datasource.DataSource
import com.example.cityexplorerapp.ui.ActivityPlacesScreen
import com.example.cityexplorerapp.ui.CityScreen
import com.example.cityexplorerapp.ui.PlacesToVisitScreen

// TODO: Screeon enum

// TODO: APP bar composable
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SuperHeroTopBar(){
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Choose your city",
                style = MaterialTheme.typography.displayLarge
            )
        }
    )
}
@Composable
fun CityExplorerApp() {
    // TODO: create navController and VM

    // TODO: scaffold(topBar) { NavHost }
    SuperHeroApp()

    // Testing purpose
}

@Composable
fun SuperHeroApp(){
    Scaffold(
        topBar = {
            SuperHeroTopBar()
        }
    ) {
            it ->
        LazyColumn(contentPadding = it){
            items(DataSource.cities){
                CityScreen(
                    cityDetails = it,
                    onCardClicked = {}
                )
            }
            items(DataSource.placles){
                PlacesToVisitScreen(
                    placesDetails = it,
                    onCardClicked = {}
                )
            }
            items(DataSource.activity){
                ActivityPlacesScreen(
                    activityDetails = it,
                    onCardClicked = {}
                )
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun CityExplorerPreview() {
    CityExplorerApp()
}
