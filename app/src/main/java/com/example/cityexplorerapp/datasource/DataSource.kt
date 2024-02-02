package com.example.cityexplorerapp.datasource

import com.example.cityexplorerapp.R
import com.example.cityexplorerapp.model.CommonModel


object DataSource {
    val cities = listOf<CommonModel>(
        CommonModel(R.drawable.delhi, R.string.delhi, R.string.del_2_Lines),
        CommonModel(R.drawable.mumbai,R.string.mumbai, R.string.mum_2_lines),
        CommonModel(R.drawable.chennai, R.string.chennai, R.string.che_2_lines)
    )

    val placles = listOf<CommonModel>(
        CommonModel(R.drawable.india_gate, R.string.indiaGate, R.string.indiaGateInfo),
        CommonModel(R.drawable.rashtra_pati_bhawan, R.string.rashtraPatiBhawan, R.string.rastrapatiBhawanInfo),
        CommonModel(R.drawable.jantar_mantar, R.string.jantarMantar, R.string.jantarMantarInfo),
        CommonModel(R.drawable.red_fort, R.string.redFort, R.string.redFortInfo),
        CommonModel(R.drawable.lotus_temple, R.string.lotusTemple, R.string.lotusTempleInfo),
        CommonModel(R.drawable.gurudwara_bangla_sahib, R.string.gurudwaraBanglaSahib, R.string.gurudwaraBanglaSahibInfo),
        CommonModel(R.drawable.akshardham_temple, R.string.akshardhamTemple, R.string.akshardhamTempleInfo)
    )

    val activity = listOf<CommonModel>(
        CommonModel(R.drawable.nehru_planetarium, R.string.nehruPlanetarium, R.string.nehruPlanetariumInfo),
        CommonModel(R.drawable.smaaash, R.string.smaaash, R.string.smaaashInfo),
        CommonModel(R.drawable.kittu_su, R.string.kittuSu, R.string.kittuSuInfo),
        CommonModel(R.drawable.mystru_rooms, R.string.mystryRooms, R.string.mystryRoomsInfo),
        CommonModel(R.drawable.paintball_co, R.string.paintballCo, R.string.paintballCoInfo)
    )
}