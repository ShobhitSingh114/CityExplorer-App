package com.example.cityexplorerapp.datasource

import com.example.cityexplorerapp.R
import com.example.cityexplorerapp.model.CityModel


object DataSource {
    val cities = listOf<CityModel>(
        CityModel(R.drawable.delhi, R.string.delhi, R.string.del_2_Lines),
        CityModel(R.drawable.mumbai,R.string.mumbai, R.string.mum_2_lines),
        CityModel(R.drawable.chennai, R.string.chennai, R.string.che_2_lines)
    )
}