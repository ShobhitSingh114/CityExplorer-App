package com.example.cityexplorerapp

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.cityexplorerapp.datasource.DataSource
import com.example.cityexplorerapp.ui.CityScreen
import com.example.cityexplorerapp.ui.ExplorerViewModel

// TODO: Screeon enum
enum class CityExplorerScreen(@StringRes val title: Int) {
    CityScreen(R.string.choose_your_city),
    PlacesToVisitScreen(R.string.places_to_visit),
    ActivityPlacesScreen(R.string.activity_places)
}
// TODO: APP bar composable
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CityExplorerTopBar(
    currentScreen: CityExplorerScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
){
    TopAppBar(
        title = {
            Text(
//                text = currentScreen.title,
                text = stringResource(id = currentScreen.title),
                style = MaterialTheme.typography.displayLarge
            )
        },
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back_button)
                    )
                }
            }
        }
    )
}
@Composable
fun CityExplorerApp() {
    // TODO: create navController and VM
    val viewModel: ExplorerViewModel = viewModel()
    val navController: NavHostController = rememberNavController()

    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = CityExplorerScreen.valueOf(
        backStackEntry?.destination?.route ?: CityExplorerScreen.CityScreen.name
    )

    // TODO: scaffold(topBar) { NavHost }
    Scaffold(
        topBar = { CityExplorerTopBar(currentScreen = currentScreen,
            canNavigateBack = navController.previousBackStackEntry != null,
            navigateUp = { navController.navigateUp() }) },
        bottomBar = { CityExplorerBottomBar() }
    ) { ip ->
        NavHost(navController = navController, startDestination = CityExplorerScreen.CityScreen.name) {
            // citySCreen
            composable(CityExplorerScreen.CityScreen.name){
                LazyColumn(contentPadding = ip) {
                    items(DataSource.cities) {
                        CityScreen(
                            cityDetails = it,
                            onCardClicked = {
                                navController.navigate(CityExplorerScreen.PlacesToVisitScreen.name)
                            }
                        )
                    }
                }
            }
            // placestoVisitScreen
            composable(CityExplorerScreen.PlacesToVisitScreen.name) {
                LazyColumn(contentPadding = ip) {
                    items(DataSource.placles) {
                        CityScreen(
                            cityDetails = it,
                            onCardClicked = { navController.navigate(CityExplorerScreen.ActivityPlacesScreen.name) }
                        )
                    }
                }
            }
            // activityPlacesScreen
            composable(CityExplorerScreen.ActivityPlacesScreen.name) {
                LazyColumn(contentPadding = ip) {
                    items(DataSource.activity) {
                        CityScreen(
                            cityDetails = it,
                            onCardClicked = { navController.navigate(CityExplorerScreen.PlacesToVisitScreen.name) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun CityExplorerBottomBar() {

    BottomAppBar(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_normal))
        ) {
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .weight(1f)
                    .padding(start = dimensionResource(id = R.dimen.padding_small))
            ) {
                Text(text = "cancel")
            }

            Button(
                onClick = { /*TODO*/ },
                // this is how to change button color
//                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.),
                modifier = Modifier
                    .weight(1f)
                    .padding(end = dimensionResource(id = R.dimen.padding_small))
            ) {
                Text(text = "next")
            }
        }
    }

}


@Preview(showSystemUi = true)
@Composable
fun CityExplorerPreview() {

}
