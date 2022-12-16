class AttackeBlitz(
    var blitzlichtHoesterSchaden: Int = 300, var blitzkrautHoesterSchaden: Int = 200,
    var blitzaraHoesterSchaden: Int = 150, var blitzsativaHoesterSchaden: Int = 80,
) : Attacke() {


    // 1 - blitzlicht attacke
    fun blitzlichtattacke(): Int {
        var blitzlichtschaden = randomwert(blitzlichtHoesterSchaden)

        println("Angriff Blitzlicht ${blitzlichtschaden}")
        return blitzlichtschaden
    }

    // 2 - blitzkraut attacke
    fun blitzkrautattacke(): Int {
        var blitzkrautschaden = randomwert(blitzkrautHoesterSchaden)

        println("Angriff Blitzkraut ${blitzkrautschaden}")
        return blitzkrautschaden
    }

    // 3 - blitzara attacke
    fun blitzaraattacke(): Int {
        var blitzaraschaden = randomwert(blitzaraHoesterSchaden)

        println("Angriff Blitzara ${blitzaraschaden}")
        return blitzaraschaden
    }

    // 4 - blitzsativa attacke
    fun blitzsativaattacke(): Int {
        var blitzsativaschaden = randomwert(blitzsativaHoesterSchaden)

        println("Angriff Blitzativa ${blitzsativaschaden}")
        return blitzsativaschaden
    }
}