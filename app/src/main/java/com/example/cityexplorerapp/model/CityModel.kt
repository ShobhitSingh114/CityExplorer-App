package com.example.cityexplorerapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CityModel(
    @DrawableRes val cityImage: Int,
    @StringRes val cityName: Int,
    @StringRes val twoCityLines: Int
)