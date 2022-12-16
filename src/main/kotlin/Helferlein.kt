class Helferlein(
    name: String, attacke: String, hp: Int, var dosenhiebHoestschaden: Int = 70, var kaukaliusHoestschaden: Int = 50,
    var spuckHoestSchaden: Int = 40,
) : Helden(name, attacke, hp) {


    var attackenListe = mutableListOf<Int>(
        dosenhiebHoestschaden,
        kaukaliusHoestschaden,
        spuckHoestSchaden
    )

    override fun mitstreiter() {

        println(
            "Ich bin das kleine Helferlein meines Bosses ich heiße $name ich werde meinen Boss immer Treu sein \n" +
                    "meine Fähigkeiten sind viele Sachen aber das sage ich dir nicht\n" +
                    "und meine Erfahrung mhhhhhh las dich überraschen(-:"
        )
    }


    fun randomwert(n: Int): Int {
        val angriffswerte: List<Int> = (20..n).toList()
        val angrifswertrandom: Int = angriffswerte.random()
        return angrifswertrandom
    }


    override fun angriffHelden(heldenListe: List<Helden>) {

        val gegner: Helden = heldenListe.random()
        val angriff = attackenListe.indexOf(attackenListe.random())
println()
        println("Helferlein ${this.name} greift jetzt den Helden ${gegner.name} an.") // Ausgabe in der Main

        if (this.hp > 0 && gegner.hp > 0) {

            when (angriff) {
                1 -> {
                    val dosenhiebattacke = randomwert(dosenhiebHoestschaden)
                    println("Angriff mit Dosen Hieb ${dosenhiebattacke} ${gegner.name} hat nur noch") // Ausgabe in der Main für Attacken
                    gegner.hp -= dosenhiebattacke
                    println("${gegner.hp} Lebenspunkte") // Anzeige der Lebenspunkte die über sind
                }

                2 -> {
                    val kaukaliusattacke = randomwert(kaukaliusHoestschaden)
                    println("Angriff mit kaukaliu ${kaukaliusattacke} ${gegner.name} hat nur noch ")
                    gegner.hp -= kaukaliusattacke
                    println("${gegner.hp} Lebenspunkte")
                }

                3 -> {
                    val spuckattacke = randomwert(spuckHoestSchaden)
                    println("Angriff mit spuck ${spuckattacke} ${gegner.name} hat nur noch ")
                    gegner.hp -= spuckattacke
                    println("${gegner.hp} Lebenspunkte")
                }
            }
        }
    }
}



