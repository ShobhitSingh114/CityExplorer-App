package com.example.cityexplorerapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CityModel(
    @DrawableRes val cityImage: Int,
    @StringRes val cityName: Int,
    @StringRes val twoCityLines: Int
)

data class PlacesToVisitModel(
    @DrawableRes val placeImage: Int,
    @StringRes val placeName: Int,
    @StringRes val placeInfo: Int
)

data class ActivityPlacesModel(
    @DrawableRes val activityImage: Int,
    @StringRes val activityName: Int,
    @StringRes val activityInfo: Int
)