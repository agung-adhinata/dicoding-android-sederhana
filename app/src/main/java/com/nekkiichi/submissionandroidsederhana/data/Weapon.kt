package com.nekkiichi.submissionandroidsederhana.data

data class Weapon(
    var title: String = "",
    var description: String = "",
    var image: Int = 0,
    var stat: WeaponStat = WeaponStat()
)

data class WeaponStat(
    var atk:Int = 0,
    var weight: Double = 0.0,
    var skill: String = ""
)