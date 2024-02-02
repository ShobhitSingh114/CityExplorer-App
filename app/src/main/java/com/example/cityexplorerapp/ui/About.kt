package com.example.cityexplorerapp.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
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
import com.example.cityexplorerapp.model.CommonModel


@Composable
fun About(
    @StringRes about: Int
){
    Column {
        Text(
            text = "About: ",
            modifier = Modifier.padding(
                start = dimensionResource(id = R.dimen.padding_normal),
                top = dimensionResource(id = R.dimen.padding_normal)
            )
        )
        Text(
            text = stringResource(id = about),
            modifier = Modifier.padding(
                start = dimensionResource(id = R.dimen.padding_normal),
                bottom = dimensionResource(id = R.dimen.padding_normal),
                end = dimensionResource(id = R.dimen.padding_normal)
            )
        )
    }
}
@Composable
fun Image(
    @DrawableRes icon: Int,
    cityDetails: CommonModel
){
    var expanded by rememberSaveable {
        mutableStateOf(false)
    }
    Image(
        painter = painterResource(id = icon),
        contentDescription = "null",
        modifier = Modifier
            .size(dimensionResource(id = R.dimen.image_size))
            .padding(dimensionResource(id = R.dimen.padding_normal))
            .clip(MaterialTheme.shapes.small)
            .clickable { expanded = !expanded },
        contentScale = ContentScale.FillBounds
    )
    if (expanded){
        About(cityDetails.info)
    }
}
@Composable
fun Text(
    @StringRes placeName: Int,
    @StringRes placeInfo: Int
){
    Column(
        modifier = Modifier
            .padding(top = 16.dp, bottom = 16.dp, end = 16.dp)
            .fillMaxSize()
    ) {
        Text(
            text = stringResource(id = placeName),
            modifier = Modifier,
            style = MaterialTheme.typography.displayMedium
        )
        Text(
            text = stringResource(id = placeInfo),
            modifier = Modifier,
            style = MaterialTheme.typography.bodyLarge,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun AboutPreview() {
    About(about = R.string.kittuSuInfo)
}
