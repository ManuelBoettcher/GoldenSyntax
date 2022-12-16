class AttackeFeuer(
    var feuerHoestSchaden: Int = 300, var feugaHoestSchaden: Int = 200,
    var feuraHoestSchaden: Int = 150, var feuragaHoestSchaden: Int = 80,
) : Attacke() {

    //1-feuer attacke
    fun feuerattacke(): Int {
        var feuerschaden = randomwert(feuerHoestSchaden)
        println("Angriff mit Feuer ${feuerschaden}")
        return feuerschaden

    }    //2-feuga attacke

    fun feugaattacke(): Int {
        var feugaschaden = randomwert(feugaHoestSchaden)

        println("Angriff mit Feuga ${feugaschaden}")
        return feugaschaden

    }   //3-feura attacke

    fun feuraattacke(): Int {
        var feuraschaden = randomwert(feuraHoestSchaden)

        println("Angriff mit Feura ${feuraschaden}")
        return feuraHoestSchaden

    }    // 4-feuraga attacke

    fun feuragaattacke(): Int {
        var feuragaschaden = randomwert(feuragaHoestSchaden)

        println("Angriff mit Feura ${feuragaschaden}")
        return feuragaschaden
    }
}