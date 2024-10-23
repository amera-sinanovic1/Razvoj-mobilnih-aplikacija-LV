// Glavna funkcija
fun main() {
    val menadžer = Menadžer("Amer", "Kovač", 3000.0, 3)
    val inžinjer = Inžinjer("Lejla", "Softić", 2500.0, "Mašinstvo")

    // Prikaz informacija i bonusa za menadžera i inžinjera
    println("Menadžer ${menadžer.imeZaposlenika} ${menadžer.prezimeZaposlenika} ima bonus: ${menadžer.izračunajBonus()} KM")
    println("Inžinjer ${inžinjer.imeZaposlenika} ${inžinjer.prezimeZaposlenika} ima bonus: ${inžinjer.izračunajBonus()} KM")

    // Ažuriranje broja timova i specijalnosti
    menadžer.brojTimovaMenadžera = 4
    inžinjer.specijalnostInžinjera = "Elektrotehnika"

    // Ponovni prikaz informacija nakon promjena
    println("Menadžer ${menadžer.imeZaposlenika} ${menadžer.prezimeZaposlenika} (nakon promjene) ima bonus: ${menadžer.izračunajBonus()} KM")
    println("Inžinjer ${inžinjer.imeZaposlenika} ${inžinjer.prezimeZaposlenika} (nakon promjene) ima bonus: ${inžinjer.izračunajBonus()} KM")
}


// Apstraktna klasa Zaposlenik
abstract class Zaposlenik(
    private var ime: String,
    private var prezime: String,
    private var plata: Double
) {
    // Getter i setter za ime
    var imeZaposlenika: String
        get() = ime
        set(value) {
            ime = value
        }

    // Getter i setter za prezime
    var prezimeZaposlenika: String
        get() = prezime
        set(value) {
            prezime = value
        }

    // Getter i setter za platu
    var plataZaposlenika: Double
        get() = plata
        set(value) {
            if (value > 0) {
                plata = value
            } else {
                println("Plata mora biti veća od 0.")
            }
        }

    // Apstraktna metoda za izračun godišnjeg bonusa
    abstract fun izračunajBonus(): Double
}

// Klasa Menadžer koja nasljeđuje Zaposlenik
class Menadžer(
    ime: String,
    prezime: String,
    plata: Double,
    private var brojTimova: Int
) : Zaposlenik(ime, prezime, plata) {

    // Getter i setter za broj timova
    var brojTimovaMenadžera: Int
        get() = brojTimova
        set(value) {
            brojTimova = value
        }

    // Implementacija metode za izračun godišnjeg bonusa
    override fun izračunajBonus(): Double {
        val bonusPoTimu = 1000.0
        return bonusPoTimu * brojTimova
    }
}

// Klasa Inžinjer koja nasljeđuje Zaposlenik
class Inžinjer(
    ime: String,
    prezime: String,
    plata: Double,
    private var specijalnost: String
) : Zaposlenik(ime, prezime, plata) {

    // Getter i setter za specijalnost
    var specijalnostInžinjera: String
        get() = specijalnost
        set(value) {
            specijalnost = value
        }

    // Implementacija metode za izračun godišnjeg bonusa
    override fun izračunajBonus(): Double {
        val bonusZaInžinjera = 500.0
        return bonusZaInžinjera
    }
}


