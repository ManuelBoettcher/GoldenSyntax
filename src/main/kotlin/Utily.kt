fun statusHP(heldenListe: MutableList<Helden>) {
    for (held in heldenListe) {

        println("Der Held ${held.name} hat noch ${held.hp} Lebenspunkte über.")
    }
}

fun kampf(
    heldFeuer: Helden, heldEis: Helden, heldSchwerdoxi: Helden, boss: Entgegner, helferlein: Helferlein,
    heldenListe: MutableList<Helden>,  //Liste der Helden in reihe ausgabe in der main unter sonst kommt es zum Fehler Kampf
) {

    println(
        "Die Helden ${heldEis.name} und ${heldFeuer.name} und ${heldSchwerdoxi.name} Kämpfen gegen ${boss.name}" +
                " und ${helferlein.name} das kleine Helferlei"
    )


    var boolean = true

    while (boolean == true) {

        if (heldFeuer.hp >= 1) {
            heldFeuer.angriffBoss(heldFeuer, boss)//Übergiebt die Attacken so wie den Heiltrank
        }
        if (heldEis.hp >= 1) {
            heldEis.angriffBoss(heldEis,boss)
        }
        if (heldSchwerdoxi.hp >= 1) {
            heldSchwerdoxi.angriffBoss(heldSchwerdoxi,
                boss)
        }

        boss.angriffHelden(heldenListe)
        helferlein.angriffHelden(heldenListe)
println("=============================================================Zwischen Stand====================================================================")
        val heldIterator =
            heldenListe.iterator() //würd überprüft auf die noch HPs haben sonst werden sie aus der Liste entfernt
        while (heldIterator.hasNext()) {
            val held = heldIterator.next()
            if (held.hp <= 0) {
                heldIterator.remove()
            }
        }

        statusHP(heldenListe)
println("==============================================================Nächte Runde=====================================================================")

        if (heldEis.hp <= 0 && heldFeuer.hp <= 0 && heldSchwerdoxi.hp <= 0) { //Würd das Team geprüft für die HP

            boolean = false
            println(
                "Alle Helden ${heldEis.name} und ${heldFeuer.name} und ${heldSchwerdoxi.name} sind Leider von uns gegangen,\n" +
                        "Die Seelen der Helden werden den Himmel überlasen und Sie werden ihre Ruhe finden.\n " + //Ausgabe wenn die Helden verloren haben
                        "\nleider hat der Boss ${boss.name} gewonnen."
            )
        }
        if (boss.hp <= 0) {
            println()
            boolean = false //todo noch mal nachschauen
            println("Der Boss ${boss.name} ist besiegt worden.\n" +
                    "Das kann nicht sein, dass ihr mich besiegt habt.\n" +
                    "Ich werde wieder kommen und stärker sein Denkt an meine Worte ihr Halunken.\n" +
                    "das Helferlein hat sich aus den Staub gemacht.\nIch hätte doch zu den anderen Boss gehen sollen, vielleicht nimmt er mich ja noch?") //Ausgabe, wenn der Boss verloren hat
            break
        }
        if (helferlein.hp <= 0) {
            println()
            boolean = false
            println("Das Helferlein ${helferlein.name} ist besiegt worden") //Ausgabe, wenn der Boss verloren hat
        }
    }
}
