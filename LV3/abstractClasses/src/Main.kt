//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val car = Car("BMW", "Red", 1, 4 )
    //val vozilo = Vehicle()
    Pizza().consume()
}

//Ne može se instancirati, mora imati definiranu podklasu
//Slično sučelju s dodanom mogućnošću pohranjivanja stanja
//Atributi i funkcije sa ključnom riječi abstract mora biti override - ponovno definirane
//Može sadržavati i ne-abstraktne atribute i funkcije
abstract class Vehicle( ) {
    abstract fun move ()
    abstract  fun stop()
}
//Kotlin klase su po defaultu final
class Car(val name:String, val color:String, val engines:Int, val doors:Int ):Vehicle() {
    override fun move() {
        TODO()
    }
    override fun stop() {
        TODO()
    }
}

abstract class Food {
    abstract val kcal : Int
    abstract val name : String
    fun consume() = println("I'm eating ${name}")
}
class Pizza() : Food() {
    override val kcal = 600
    override val name = "Pizza"
}

