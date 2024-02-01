package com.example.cityexplorerapp.datasource

import com.example.cityexplorerapp.R
import com.example.cityexplorerapp.model.ActivityPlacesModel
import com.example.cityexplorerapp.model.CityModel
import com.example.cityexplorerapp.model.PlacesToVisitModel


object DataSource {
    val cities = listOf<CityModel>(
        CityModel(R.drawable.delhi, R.string.delhi, R.string.del_2_Lines),
        CityModel(R.drawable.mumbai,R.string.mumbai, R.string.mum_2_lines),
        CityModel(R.drawable.chennai, R.string.chennai, R.string.che_2_lines)
    )

    val placles = listOf<PlacesToVisitModel>(
        PlacesToVisitModel(R.drawable.india_gate, R.string.indiaGate, R.string.indiaGateInfo),
        PlacesToVisitModel(R.drawable.rashtra_pati_bhawan, R.string.rashtraPatiBhawan, R.string.rastrapatiBhawanInfo),
        PlacesToVisitModel(R.drawable.jantar_mantar, R.string.jantarMantar, R.string.jantarMantarInfo),
        PlacesToVisitModel(R.drawable.red_fort, R.string.redFort, R.string.redFortInfo),
        PlacesToVisitModel(R.drawable.lotus_temple, R.string.lotusTemple, R.string.lotusTempleInfo),
        PlacesToVisitModel(R.drawable.gurudwara_bangla_sahib, R.string.gurudwaraBanglaSahib, R.string.gurudwaraBanglaSahibInfo),
        PlacesToVisitModel(R.drawable.akshardham_temple, R.string.akshardhamTemple, R.string.akshardhamTempleInfo)
    )

    val activity = listOf<ActivityPlacesModel>(
        ActivityPlacesModel(R.drawable.nehru_planetarium, R.string.nehruPlanetarium, R.string.nehruPlanetariumInfo),
        ActivityPlacesModel(R.drawable.smaaash, R.string.smaaash, R.string.smaaashInfo),
        ActivityPlacesModel(R.drawable.kittu_su, R.string.kittuSu, R.string.kittuSuInfo),
        ActivityPlacesModel(R.drawable.mystru_rooms, R.string.mystryRooms, R.string.mystryRoomsInfo),
        ActivityPlacesModel(R.drawable.paintball_co, R.string.paintballCo, R.string.paintballCoInfo)
    )
}