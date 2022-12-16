class Entgegner(
    var name: String,
    var attacke: String,
    var hp: Int,
    var umituHoestSchaden: Int = 400,
    var agssaHoestSchaden: Int = 200,
    var eraluHoestSchaden: Int = 150,
    var agsamiHoestSchaden: Int = 100,
    var itwuHoestschaden: Int = 85,
    var tirituHoestSchaden: Int = 65,
) {

    var attackenListe = mutableListOf(
        umituHoestSchaden,
        agssaHoestSchaden,
        eraluHoestSchaden,
        agsamiHoestSchaden,
        itwuHoestschaden,
        tirituHoestSchaden
    )

    fun randomwert(n: Int): Int { //wird zufällig der schaden gemacht
        val angriffswerte: List<Int> = (20..n).toList()
        val angrifswertrandom: Int = angriffswerte.random()
        return angrifswertrandom
    }


    fun angriffHelden(heldenListe: MutableList<Helden>) {

        val gegner: Helden = heldenListe.random()
        val angriff = attackenListe.indexOf(attackenListe.random())
println("======================================================Jetzt ist das Bösse dran=================================================================")
        println("Boss $name greift jetzt den Helden ${gegner.name} an.") // Ausgabe in der Main

        if (this.hp > 0 && gegner.hp > 0) {


            when (angriff) {
                1 -> {
                    val eraluattacke = randomwert(eraluHoestSchaden)
                    println("Angriff mit Eralu $eraluattacke ${gegner.name} hat nur noch ") // Ausgabe in der Main für Attacken
                    gegner.hp -= eraluattacke
                    println("${gegner.hp} Lebenspunkte") // Anzeige der Lebenspunkte die über sind
                }

                2 -> {
                    val umitubattacke = randomwert(umituHoestSchaden)
                    println("Angriff mit Umitu ${umitubattacke} ${gegner.name} hat nur noch ")
                    gegner.hp -= umitubattacke
                    println("${gegner.hp} Lebenspunkte")
                }

                3 -> {
                    val agssaattacke = randomwert(agssaHoestSchaden)
                    println("Angriff mit Agssa ${agssaattacke} ${gegner.name} hat nur noch ")
                    gegner.hp -= agssaattacke
                    println("${gegner.hp} Lebenspunkte")
                }

                4 -> {
                    val agsamiattacke = randomwert(agsamiHoestSchaden)
                    println("Angriff mit Agsamia ${agsamiattacke} ${gegner.name} hat nur noch")
                    gegner.hp -= agsamiattacke
                    println("${gegner.hp} Lebenspunkte")
                }

                5 -> {
                    val itwuattacke = randomwert(itwuHoestschaden)
                    println("Angriff mit Agsamia ${itwuattacke} ${gegner.name} hat nur noch ")
                    gegner.hp -= itwuattacke
                    println("${gegner.hp} Lebenspunkte")
                }

                6 -> {
                    val tirituattacke = randomwert(tirituHoestSchaden)
                    println("Angriff mit Agsamia ${tirituattacke} ${gegner.name} hat nur noch ")
                    gegner.hp -= tirituattacke
                    println("${gegner.hp} Lebenspunkte")
                }
            }
        }
    }
}
