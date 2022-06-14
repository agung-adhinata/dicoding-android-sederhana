package com.nekkiichi.submissionandroidsederhana.data

import com.nekkiichi.submissionandroidsederhana.R

//Source : eldenring.wiki.fextralife.com: akses pada tanggal 6 Juni 2022
object WeaponData {
    private val weaponNames = arrayOf(
        "Zweihander",
        "GreatSword",
        "Watchdog's GreatSword",
        "Troll's Golden Sword",
        "Troll Knight's Sword",
        "Royal Greatsword",
        "Grafted Blade Greatsword",
        "Ruins Greatsword",
        "Starscourge Greatsword",
        "Godslayer's Greatsword",
        "Maliketh's Black Blade"
    )
    private val weaponDesc = arrayOf(
        "Just about the largest sword a mere man is capable of swinging. True to its name, it is designed to be wielded in both hands, but those of merely ordinary strength will still struggle to do so.\nThe long blade is heavy and sharp, sending foes reeling back with its broader strokes, while also capable of a devastating piercing thrust.",
        "A coarse iron lump of an ultra greatsword.\nMows down foes by utilizing its incredible weight.\n\nThough handling it likely requires the wielder to have surpassed the realm of the merely human,\nit is precisely for this reason the weapon is used to slaughter even inhuman foes."
    ,"Stone greatsword wielded by Erdtree Burial Watchdogs.\n\nThough decorated with the watchman's eye, the pupil was taken by graverobbers and is now hollow, leaving this sword a mere lump of stone."
    ,"Sword given to the lesser giants who fought for the Erdtree during the War against the Giants long ago.\n\nThough the giants have lost their minds, they stay inseparable from their swords that are in sad shape—such that the gold plating had flaked away."
    ,"Greatsword embedded with a blue glintstone.\nWeapon of the trolls in service to the royal family of Caria.\n\nCalled into service when the Queen invoked an oath they swore,\nthe trolls are treated as true knights of Caria, and fight arm in arm with their human comrades."
    ,"Greatsword decorated in royal Carian Style. Favored weapon of Blaidd the Half-Wolf.\n\nIn defiance of the fate he was born to, Blaidd swore to serve no master but Ranni. As proof. the sword was imbued with a cold magic at the moment oath was sworn."
    ,"The storied sword of Castle Morne. A revenger's weapon, it is burdened with oceans of anger and regret. \nOne of the legendary armaments. \n\nA lone surviving champion from a country now vanished was so determined to continue fighting that he claimed the swords of an entire clan of warriors"
    ,"Originally rubble from a ruin which fell from the sky, this surviving fragment was honed into a weapon.\nOne of the legendary armaments.\n\nThe ruin it came from crumbled when struck by a meteorite, as such this weapon harbors its destructive power."
    ,"Curved greatswords of black steel wielded by General Radahn. A pair of weapons decorated with a lion mane motif.\n\nRadahn earned considerable renown as the Starscourge in this youth, and it is said that it was during this time he engraved the gravity crest up these blades. "
    ,"Sacred sword of the Dusk-Eyed Queen who controlled the Godskin Apostles before her defeat at the hands of Maliketh.\n\nThe black flames wielded by the apostles are channeled from this sword."
    ,"Maliketh's black blade which once harbored the power of the Rune of Death. A sad shadow of its former glory.\n\nAfter a fragment of Death was stolen on that fateful night,\nMaliketh bound the blade within his own flesh, such that none might ever rob Death again."
    )
    private val weaponStats = arrayOf(
        WeaponStat(141, 15.5, "Upward Cut\n\nStamp (Upward Cut) is a skill to help with your stance and positioning. Use this skill when going against larger enemies with higher chances of recoil to reduce it. "),
        WeaponStat(164, 23.0, "Upward Cut\n\nStamp (Upward Cut) is a skill to help with your stance and positioning. Use this skill when going against larger enemies with higher chances of recoil to reduce it. "),
        WeaponStat(142, 22.0, "Upward Cut\n\nStamp (Upward Cut) is a skill to help with your stance and positioning. Use this skill when going against larger enemies with higher chances of recoil to reduce it. "),
        WeaponStat(155, 19.0, "Troll's Roar\n\nTroll's Roar is a skill found on the Troll's Hammer, Troll's Golden Sword, and Troll Knight's Sword. This allows the user to distance himself from nearby enemies by generating a shockwave that blows them back. "),
        WeaponStat(124, 18.0, "Troll's Roar\n\nTroll's Roar is a skill found on the Troll's Hammer, Troll's Golden Sword, and Troll Knight's Sword. This allows the user to distance himself from nearby enemies by generating a shockwave that blows them back. "),
        WeaponStat(112, 20.0, "Wolf's Assault\n\nWolf's Assault is a skill in Elden Ring that is unique to the Royal Greatsword. It allows the player to infuse the weapon with frost then perform a forward somersault to plunge it into the ground, pulling it out will release a cold blast."),
        WeaponStat(162, 21.0, "Oath of Vengeance\n\nOath of Vengeance is a unique skill directly equipped with the Grafted Blade Greatsword, which can be obtained from Castle Morne. "),
        WeaponStat(124, 23.0, "Wave of Destruction\n\nWave of Destruction is a unique skill that is only available for the Ruins Greatsword, and it cannot be applied to other weapons via Ashes of War"),
        WeaponStat(129, 20.0, "Starcaller Cry\n\nStarcaller Cry is a unique skill for the Starscourge Greatsword. It pulls in enemies with a gravitational wave and additionally allows the user of the skill to follow up with a slam down the swords."),
        WeaponStat(119, 17.5, "The Queen's Black Flame\n\nThe Queen's Black Flame is a unique skill directly equipped with the Godslayer's Greatsword, which can be obtained from the Divine Tower of Caelid."),
        WeaponStat(127, 22.0, "Destined Death\n\nDestined Death allows the user to create a myriad of blades, to deal damage.")
    )
    private val weaponImages = intArrayOf(
        R.drawable.zweihander_colossal_swords_elden_ring,
        R.drawable.greatsword_colossal_swords_elden_ring,
        R.drawable.watchdogs_greatsword_colossal_swords_elden_ring,
        R.drawable.trolls_golden_sword_colossal_swords_elden_ring,
        R.drawable.troll_knights_sword_colossal_swords_elden_ring,
        R.drawable.royal_greatsword__colossal_swords_elden_ring,
        R.drawable.grafted_blade_greatsword_colossal_swords_elden_ring,
        R.drawable.ruins_greatsword_colossal_swords_elden_ring,
        R.drawable.starscourge_greatsword_colossal_swords_elden_ring,
        R.drawable.godslayers_greatsword_colossal_swords_elden_ring,
        R.drawable.malikeths_black_blade_colossal_swords_elden_ring
        )

    val listData: ArrayList<Weapon>
        get() {
            val list = arrayListOf<Weapon>()
            for (position in weaponNames.indices) {
                val wpn = Weapon()
                wpn.title = weaponNames[position]
                wpn.description = weaponDesc[position]
                wpn.stat = weaponStats[position]
                wpn.image = weaponImages[position]
                list.add(wpn)
            }
            return list
        }


}