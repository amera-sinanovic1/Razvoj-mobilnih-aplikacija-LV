//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //instanca klase
    val auto1= Car()
    auto1.name = "Tesla"
    auto1.model= "S Plaid"
    auto1.color = "White"
    auto1.doors=4

    println("Name= ${auto1.name}")
    println("Model= ${auto1.model}")
    println("Color= ${auto1.color}")
    println("Doors= ${auto1.doors}")
    auto1.move()
    auto1.stop()

    val auto2= Car()
    auto2.name = "Audi"
    auto2.model= "A8"
    auto2.color = "Black"
    auto2.doors=4
    println("\n")
    println("Name= ${auto2.name}")
    println("Model= ${auto2.model}")
    println("Color= ${auto2.color}")
    println("Doors= ${auto2.doors}")
    auto2.move()
    auto2.stop()

}

//klasa
class Car{
    //propties
    var name= " "
    var model = " "
    var color = " "
    var doors=0

    fun move (){
        println("Auto se krece.")
        println("Auto $name se krece.")
    }

    fun stop(){
        println("Auto se zaustavio.")
        println("Auto $name se zaustavio.")
    }
}