fun main() {
    println("                                                Willkommen zum Spiel FUN (Family Unit)\n\n" +
            "Denke auch dran, dass es auch ein Reales Leben gibt, gehe auch raus, PC Spiele sind nicht dein Leben XD.\n" +
            "Denke dran das es nur ein Spiel ist und nicht Real, also denke immer dran,\n(Behandel einen Menschen so wie du selber behandelt werden willst, mit Respekt und Würde.\n" +
            "Aber jetzt habe Spaß am Spielen.")
    println()
println("=====Es-geht-los=====Es-geht-los=====Es-geht-los=====Es-geht-los=====Es-geht-los=====Es-geht-los=====Es-geht-los=====Es-geht-los=====Es-geht-los=====")
    println()
    println("Hallo mein Herr, wir verteidigen dich")
    println()
    //Helden
    val held1 = Helden("Nerota", "Feuer", 600)
    val held2 = Helden("Erbuaz", "Eis", 500)
    val held3 = Helden("Taurusban", "Schwerdoxi", 300)
    val heldenListe: MutableList<Helden> = mutableListOf(held1, held2, held3)
    held1.mitstreiter()
    held2.mitstreiter()
    held3.mitstreiter()
    println()

    //Boss
    val boss = Entgegner("Atoren", "Schwarze Magie", 2500)
    println(
        "Ich bin der große Herrscher der Unterwelt mein Name ist Atoren ich werde euch alle vernichten.\n" +
                "Meine Macht werdet ihr gleich kennen lernen"
    )


    //Helferlein
    val helfer = Helferlein("Nigash", "Heil Trank groß", 250)
    println()
    helfer.mitstreiter()
    println()

    //Kampf
    kampf(held1, held2, held3, boss, helfer, heldenListe)
println("==========================================================================================================================================")
println("Leider ist das Spiel zu Ende, wir hoffen, du hattest Spaß gehabt und Empfahlst das Spiel weiter.\n" +
        "Mit freundlichen Grüßen dein Family-Unit-Team")

    println()
println("======================================================Schluss Plädoye=====================================================================")
    println()
    println("Danke an alle die mir geholfen haben.")
}
