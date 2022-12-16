class AttackeEis(
    var eisblitzHoestSchaden: Int = 300, var eiswuerffelHoestSchaden: Int = 200,
    var eisgaHoestSchaden: Int = 150, var eisragaHoestSchaden: Int = 85,
) : Attacke() {


    // 1- eisblitz attacke
    fun eisblitzattacke(): Int {
        var eisblitzschaden = randomwert(eisblitzHoestSchaden)

        println("Angriff mit Eisblitz ${eisblitzschaden}")
        return eisblitzschaden
    }

    // 2- eiswuerffel attacke
    fun eiswuerffelattacke(): Int {
        var eiswuerffelschaden = randomwert(eiswuerffelHoestSchaden)

        println("Angriff mit Eiswürfel ${eiswuerffelschaden}")
        return eiswuerffelschaden
    }

    // 3- eisga attacke
    fun eisgaattacke(): Int {
        var eisgaschaden = randomwert(eisgaHoestSchaden)

        println("Angriff mit Eisga ${eisgaschaden}")
        return eisgaschaden
    }

    // 4- eisraga attacke
    fun eisragaattacke(): Int {
        var eisragaschaden = randomwert(eisragaHoestSchaden)

        println("Angriff mit Eisraga ${eisragaschaden}")
        return eisragaschaden
    }

}