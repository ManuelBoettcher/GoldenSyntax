open class Helden(name: String, attacke: String, hp: Int) : Lebewesen(name, attacke, hp) {


    open fun mitstreiter() {

        println("Ich bin $name und meine Lebenserfahrungen sind $hp")// Ausgabe für jeden Held in der Main
    }

    fun angriffBoss(helden: Helden, gegner: Entgegner) {

        if (this.hp > 0 && gegner.hp > 0) {

            var elementZahl = 0
            when (attacke) {
                "Beutel" -> elementZahl = 0    //Das sind die verschiedene Attacken Classen

                "Feuer" -> elementZahl = 1

                "Eis" -> elementZahl = 2

                "Blitz" -> elementZahl = 3

                "Schwerdoxi" -> elementZahl = 4
            }
            when (elementZahl) { // Das Element ist die Zahlen 1-2-3-4
                1 -> {
                    val attacke = AttackeFeuer()
                    println()
                    println("Jetzt kann dein Held $name seine Attacken wählen") //Ausgabe in der Main
                    println("Deine Auswahl an Attacken sind 1-Feuer 2-Feuga 3-Feura 4-Feuraga 0-Beutel") // Ausgabe in der Main und welsche Attacke man will
                    val attack = readln().toInt()
                    when (attack) {
                        1 -> {
                            gegner.hp -= attacke.feuerattacke()
                            println("Der Boss ${gegner.name} hat nur noch ${gegner.hp} Lebenspunkte") // Ausgabe in der Main wie viel HP hat mit name nach den Attacken hat
                        }

                        2 -> {
                            gegner.hp -= attacke.feugaattacke()
                            println("Der Boss ${gegner.name} hat nur noch ${gegner.hp} Lebenspunkte")
                        }

                        3 -> {
                            gegner.hp -= attacke.feuraattacke()
                            println("Der Boss ${gegner.name} hat nur noch ${gegner.hp} Lebenspunkte")
                        }

                        4 -> {50

                            gegner.hp -= attacke.feuragaattacke()
                            println("Der Boss ${gegner.name} hat nur noch ${gegner.hp} Lebenspunkte")
                        }

                        0 -> {
                            //Beutel
                            println()
                            println("Jetzt kann dein Held $name seine Gegenstände wählen") //Dass man seine Attacken wählen kann seine Ausgabe in der Main
                            println("Deine Auswahl an Gegenstände sind 1-Heiltrank klein 2-Heiltrank groß 3-Schutzzauber")
                            val beutel = readln().toInt()
                            when (beutel) {
                                1 -> {
                                    helden.hp += 50
                                    println("Dein Lebenspunkte wurden mit 50 Punkte aufgeladen, sie haben jetzt ${helden.hp} Lebenspunkte")
                                }// Hir wird die Lebenstränke ausgegeben wie viel mann bekommt

                                2 -> {
                                    helden.hp += 100
                                    println("Dein Lebenspunkte wurden mit 100 Punkte aufgeladen, sie haben jetzt ${helden.hp} Lebenspunkte")
                                }

                                3 -> {
                                    helden.hp += 150
                                    println("Dein Lebenspunkte wurden mit 150 Punkte aufgeladen, sie haben jetzt ${helden.hp} Lebenspunkte")
                                }

                            }

                        }
                    }
                }

                2 -> {
                    val attacke = AttackeEis()
                    println()
                    println("Jetzt kann deine Held $name Attacken wählen")
                    println("Deine Auswahl an Attacken sind 1-Eisblitz 2-Eiswürffel 3-Eisga 4-Eisraga 0-Beutel")
                    val attack = readln().toInt()
                    when (attack) {
                        1 -> {
                            gegner.hp -= attacke.eisblitzattacke()
                            println("Der Boss ${gegner.name} hat nur noch ${gegner.hp} Lebenspunkte")
                        }

                        2 -> {
                            gegner.hp -= attacke.eiswuerffelattacke()
                            println("Der Boss ${gegner.name} hat nur noch ${gegner.hp} Lebenspunkte")
                        }

                        3 -> {
                            gegner.hp -= attacke.eisgaattacke()
                            println("Der Boss ${gegner.name} hat nur noch ${gegner.hp} Lebenspunkte")
                        }

                        4 -> {
                            gegner.hp -= attacke.eisragaattacke()
                            println("Der Boss ${gegner.name} hat nur noch ${gegner.hp} Lebenspunkte")
                        }

                        0 -> {//Beutel
                            println()
                            println("Jetzt kann dein Held $name seine Gegenstände wählen") //Ausgabe in der Main
                            println("Deine Auswahl an Gegenstände sind 1-Heiltrank klein 2-Heiltrank groß 3-Schutzzauber")
                            val beutel = readln().toInt()
                            when (beutel) {
                                1 -> {
                                    helden.hp += 50 //todo aktuellen Spieler übergeben
                                    println("Dein Lebenspunkte wurden mit 50 Punkte aufgeladen, sie haben jetzt ${helden.hp} Lebenspunkte") //todo lebenspunkte ausgeben
                                }

                                2 -> {
                                    helden.hp += 100
                                    println("Dein Lebenspunkte wurden mit 100 Punkte aufgeladen, sie haben jetzt ${helden.hp} Lebenspunkte")
                                }

                                3 -> {
                                    helden.hp += 150
                                    println("Dein Lebenspunkte wurden mit 150 Punkte aufgeladen, sie haben jetzt ${helden.hp} Lebenspunkte")
                                }
                            }
                        }
                    }
                }

                3 -> {
                    val attacke = AttackeBlitz()
                    println()
                    println("Jetzt kannst deine Held $name Attacken wählen")
                    println("Deine Auswahl an Attacken sind 1-Blitzlich 2-Blitzkraut 3-Blitzara 4-Blitzsativa 0-Beutel")
                    val attack = readln().toInt()
                    when (attack) {
                        1 -> {
                            gegner.hp -= attacke.blitzlichtattacke()
                            println("Der Boss ${gegner.name} hat nur noch ${gegner.hp} Lebenspunkte")
                        }

                        2 -> {
                            gegner.hp -= attacke.blitzkrautattacke()
                            println("Der Boss ${gegner.name} hat nur noch ${gegner.hp} Lebenspunkte")
                        }

                        3 -> {
                            gegner.hp -= attacke.blitzaraattacke()
                            println("Der Boss ${gegner.name} hat nur noch ${gegner.hp} Lebenspunkte")
                        }

                        4 -> {
                            gegner.hp -= attacke.blitzsativaattacke()
                            println("Der Boss ${gegner.name} hat nur noch ${gegner.hp} Lebenspunkte")
                        }

                        0 -> {//Beutel
                            println()
                            println("Jetzt kann dein Held $name seine Gegenstände wählen") //Ausgabe in der Main
                            println("Deine Auswahl an Gegenstände sind 1-Heiltrank klein 2-Heiltrank groß 3-Schutzzauber")
                            val beutel = readln().toInt()
                            when (beutel) {
                                1 -> {
                                    helden.hp += 50 //todo aktuellen Spieler übergeben
                                    println("Dein Lebenspunkte wurden mit 50 Punkte aufgeladen, sie haben jetzt ${helden.hp} Lebenspunkte") //todo lebenspunkte ausgeben
                                }

                                2 -> {
                                    helden.hp += 100
                                    println("Dein Lebenspunkte wurden mit 100 Punkte aufgeladen, sie haben jetzt ${helden.hp} Lebenspunkte")
                                }

                                3 -> {
                                    helden.hp += 150
                                    println("Dein Lebenspunkte wurden mit 150 Punkte aufgeladen, sie haben jetzt ${helden.hp} Lebenspunkte")
                                }
                            }
                        }
                    }
                }

                4 -> {
                    val attacke = AttackeSchwerdoxi()
                    println()
                    println("Jetzt kann deine Held $name Attacken wählen")
                    println("Deine Auswahl an Attacken sind 1-Panzerbrecher 2-Krafthieb 3-Kraftbrecher 4-Doppelhieb 0-Beutel")
                    val attack = readln().toInt()
                    when (attack) {
                        1 -> {
                            gegner.hp -= attacke.panzerbrecherattacke()
                            println("Der Boss ${gegner.name} hat nur noch ${gegner.hp} Lebenspunkte")
                        }

                        2 -> {
                            gegner.hp -= attacke.kraftHiebattacke()
                            println("Der Boss ${gegner.name} hat nur noch ${gegner.hp} Lebenspunkte")
                        }

                        3 -> {
                            gegner.hp -= attacke.kraftBrecherattacke()
                            println("Der Boss ${gegner.name} hat nur noch ${gegner.hp} Lebenspunkte")
                        }

                        4 -> {
                            gegner.hp -= attacke.doppelhiebattacke()
                            println("Der Boss ${gegner.name} hat nur noch ${gegner.hp} Lebenspunkte")
                        }

                        0 -> {//Beutel
                            println()
                            println("Jetzt kann dein Held $name seine Gegenstände wählen") //Ausgabe in der Main
                            println("Deine Auswahl an Gegenstände sind 1-Heiltrank klein 2-Heiltrank groß 3-Schutzzauber")
                            val beutel = readln().toInt()
                            when (beutel) {
                                1 -> {
                                    helden.hp += 50
                                    println("Dein Lebenspunkte wurden mit 50 Punkte aufgeladen, sie haben jetzt ${helden.hp} Lebenspunkte")
                                }

                                2 -> {
                                    helden.hp += 100
                                    println("Dein Lebenspunkte wurden mit 100 Punkte aufgeladen, sie haben jetzt ${helden.hp} Lebenspunkte")
                                }

                                3 -> {
                                    helden.hp += 150
                                    println("Dein Lebenspunkte wurden mit 150 Punkte aufgeladen, sie haben jetzt ${helden.hp} Lebenspunkte")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}












