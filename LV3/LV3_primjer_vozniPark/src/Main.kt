// Glavna funkcija
fun main() {
    val automobil = Automobil("Toyota Corolla", 2015, 60000, 4)
    val kamion = Kamion("Mercedes Actros", 2010, 120000, 8.0)

    // Prikaz troškova održavanja za automobil i kamion
    println("Automobil ${automobil.modelVozila} iz ${automobil.godinaProizvodnjeVozila} ima troškove održavanja: ${automobil.izračunajTroškoveOdržavanja()} KM")
    println("Kamion ${kamion.modelVozila} iz ${kamion.godinaProizvodnjeVozila} ima troškove održavanja: ${kamion.izračunajTroškoveOdržavanja()} KM")

    // Ažuriranje kilometraže i nosivosti
    automobil.kilometrazaVozila = 65000
    kamion.nosivostKamiona = 6.0

    // Ponovni prikaz troškova nakon promjena
    println("Automobil ${automobil.modelVozila} (nakon promjene) ima troškove održavanja: ${automobil.izračunajTroškoveOdržavanja()} KM")
    println("Kamion ${kamion.modelVozila} (nakon promjene) ima troškove održavanja: ${kamion.izračunajTroškoveOdržavanja()} KM")
}

// Apstraktna klasa Vozilo
abstract class Vozilo(
    private var model: String,
    private var godinaProizvodnje: Int,
    private var kilometraza: Int
) {
    // Getter i setter za model
    var modelVozila: String
        get() = model
        set(value) {
            model = value
        }

    // Getter i setter za godinu proizvodnje, s ograničenjem
    var godinaProizvodnjeVozila: Int
        get() = godinaProizvodnje
        set(value) {
            if (value >= 2000) {
                godinaProizvodnje = value
            } else {
                println("Godina proizvodnje mora biti veća ili jednaka 2000.")
            }
        }

    // Getter i setter za kilometražu, s ograničenjem
    var kilometrazaVozila: Int
        get() = kilometraza
        set(value) {
            if (value >= 0) {
                kilometraza = value
            } else {
                println("Kilometraža ne može biti negativna.")
            }
        }

    // Apstraktna metoda za izračun troškova održavanja
    abstract fun izračunajTroškoveOdržavanja(): Double
}

// Klasa Automobil koja nasljeđuje Vozilo
class Automobil(
    model: String,
    godinaProizvodnje: Int,
    kilometraza: Int,
    private var brojVrata: Int
) : Vozilo(model, godinaProizvodnje, kilometraza) {

    // Getter i setter za broj vrata
    var brojVrataAutomobila: Int
        get() = brojVrata
        set(value) {
            brojVrata = value
        }

    // Implementacija metode za izračun troškova održavanja
    override fun izračunajTroškoveOdržavanja(): Double {
        val osnovniTroškovi = 500.0
        val dodatniTroškovi = kilometrazaVozila * 0.10
        return osnovniTroškovi + dodatniTroškovi
    }
}

// Klasa Kamion koja nasljeđuje Vozilo
class Kamion(
    model: String,
    godinaProizvodnje: Int,
    kilometraza: Int,
    private var nosivost: Double
) : Vozilo(model, godinaProizvodnje, kilometraza) {

    // Getter i setter za nosivost
    var nosivostKamiona: Double
        get() = nosivost
        set(value) {
            nosivost = value
        }

    // Implementacija metode za izračun troškova održavanja
    override fun izračunajTroškoveOdržavanja(): Double {
        val osnovniTroškovi = 1000.0
        val dodatniTroškovi = kilometrazaVozila * 0.20
        val dodatniTroškoviZaNosivost = if (nosivost > 5) 500.0 else 0.0
        return osnovniTroškovi + dodatniTroškovi + dodatniTroškoviZaNosivost
    }
}


