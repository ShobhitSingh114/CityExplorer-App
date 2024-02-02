package com.example.cityexplorerapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CommonModel(
    @DrawableRes val image: Int,
    @StringRes val name: Int,
    @StringRes val info: Int
)