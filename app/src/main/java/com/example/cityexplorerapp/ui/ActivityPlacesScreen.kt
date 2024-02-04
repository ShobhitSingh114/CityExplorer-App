package com.example.cityexplorerapp.ui

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.cityexplorerapp.R
import com.example.cityexplorerapp.datasource.DataSource
import com.example.cityexplorerapp.model.CommonModel

@Composable
fun ActivityPlacesScreen(
    activityDetails: CommonModel,
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
            )
            .clickable { onCardClicked() },
        elevation = CardDefaults.cardElevation(
            defaultElevation = dimensionResource(id = R.dimen.card_elevation)
        )
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
                Image(icon = activityDetails.image, cityDetails = activityDetails)
                Text(placeName = activityDetails.name, placeInfo = activityDetails.info)
            }
        }
    }
}

//@Preview(showSystemUi = true)
//@Composable
//fun ActivityPlacesScreenPreview() {
//    LazyColumn{
//        items(DataSource.activity){
//            ActivityPlacesScreen(
//                activityDetails = it,
//                onCardClicked = {}
//            )
//        }
//    }
//}