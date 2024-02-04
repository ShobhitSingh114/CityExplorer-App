package com.example.cityexplorerapp.ui

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.cityexplorerapp.R
import com.example.cityexplorerapp.model.CommonModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlacesToVisitScreen(
    placesDetails: CommonModel,
    onCardClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier
            .padding(
                start = dimensionResource(id = R.dimen.padding_normal),
                end = dimensionResource(id = R.dimen.padding_normal),
                top = dimensionResource(id = R.dimen.padding_small),
                bottom = dimensionResource(id = R.dimen.padding_small)
            ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = dimensionResource(id = R.dimen.card_elevation)
        ),
        onClick = { onCardClicked() }
    ) {
        Column(
            modifier = Modifier.animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessMedium
                )
            )
//                .background(color = color)
        ) {
            Row {
                Image(placesDetails.image, placesDetails)
                Text(placesDetails.name, placesDetails.info)
            }
        }
    }
}




//@Preview(showSystemUi = true)
//@Composable
//fun PlacesToVisitScreenPreview() {
//    LazyColumn{
//        items(DataSource.placles){
//            PlacesToVisitScreen(
//                placesDetails = it,
//                onCardClicked = {}
//            )
//        }
//    }
//}