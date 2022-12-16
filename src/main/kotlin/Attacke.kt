open class Attacke() {

    open fun randomwert(n: Int): Int {  //Das ist das alles oder fast zufällig ausgesucht wird
        val angriffswerte: List<Int> = (10..n).toList()
        var angrifswertrandom: Int = angriffswerte.random()
        return angrifswertrandom

    }

    //Test
}

