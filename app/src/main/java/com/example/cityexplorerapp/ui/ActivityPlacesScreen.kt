package com.example.cityexplorerapp.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cityexplorerapp.R
import com.example.cityexplorerapp.datasource.DataSource
import com.example.cityexplorerapp.model.ActivityPlacesModel

@Composable
fun ActivityPlacesScreen(
    activityDetails: ActivityPlacesModel,
    onCardClicked: () -> Unit
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
                ActivityImage(activityDetails.activityImage)
                ActivityText(activityDetails.activityName, activityDetails.activityInfo)
            }
        }
    }
}

@Composable
fun ActivityImage(
    @DrawableRes icon: Int
){
    Image(
        painter = painterResource(id = icon),
        contentDescription = "null",
        modifier = Modifier
            .size(dimensionResource(id = R.dimen.image_size))
            .padding(dimensionResource(id = R.dimen.padding_normal))
            .clip(MaterialTheme.shapes.small),
        contentScale = ContentScale.FillBounds
    )
}

@Composable
fun ActivityText(
    @StringRes activityName: Int,
    @StringRes activityInfo: Int
){
    Column(
        modifier = Modifier
            .padding(top = 16.dp, bottom = 16.dp, end = 16.dp)
            .fillMaxSize()
    ) {
        Text(
            text = stringResource(id = activityName),
            modifier = Modifier,
            style = MaterialTheme.typography.displayMedium
        )
        Text(
            text = stringResource(id = activityInfo),
            modifier = Modifier,
            style = MaterialTheme.typography.bodyLarge,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun ActivityPlacesScreenPreview() {
    LazyColumn{
        items(DataSource.activity){
            ActivityPlacesScreen(
                activityDetails = it,
                onCardClicked = {}
            )
        }
    }
}