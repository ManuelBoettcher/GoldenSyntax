class AttackeSchwerdoxi(
    var panzerbrecherHoestSchaden: Int = 300, var kraftHiebHoestSchaden: Int = 200,
    var kraftBrecherHoestSchaden: Int = 150, var doppelhiebHoestSchaden: Int = 80,
) : Attacke() {

    // 1 - panzerbrecher attacke
    fun panzerbrecherattacke(): Int {
        var panzerbrecherschaden = randomwert(panzerbrecherHoestSchaden)

        println("Angriff mit Panzerbrecher ${panzerbrecherschaden}")
        return panzerbrecherschaden
    }

    // 2 - kraftHieb attacke
    fun kraftHiebattacke(): Int {
        var kraftHiebschaden = randomwert(kraftHiebHoestSchaden)

        println("Angriff mit Krafthieb ${kraftHiebschaden}")
        return kraftHiebschaden
    }

    // 3 - kraftBrecher attacke
    fun kraftBrecherattacke(): Int {
        var kraftBrecherschaden = randomwert(kraftBrecherHoestSchaden)

        println("Angriff mit Kraftbrecher ${kraftBrecherschaden}")
        return kraftBrecherschaden
    }

    // 4 - doppelhieb attacke
    fun doppelhiebattacke(): Int {
        var doppelhiebschaden = randomwert(doppelhiebHoestSchaden)

        println("Angriff mit Doppelhieb ${doppelhiebschaden}")
        return doppelhiebschaden
    }
}