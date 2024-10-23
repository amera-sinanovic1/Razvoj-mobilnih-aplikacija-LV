//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //instanca klase
    val auto1= Car("Tesla","S Plaid","White",4)

    println("Name= ${auto1.name}")
    println("Model= ${auto1.model}")
    println("Color= ${auto1.color}")
    println("Doors= ${auto1.doors}")
    auto1.move()
    auto1.stop()

    val auto2= Car("Audi", "A8", "Black",2)

    println("\n")
    println("Name= ${auto2.name}")
    println("Model= ${auto2.model}")
    println("Color= ${auto2.color}")
    println("Doors= ${auto2.doors}")
    auto2.move()
    auto2.stop()

}

//klasa
//class Car(name: String, model: String, color: String, doors:Int ) {
//    //property
//    var name= name //probaj obrisati ovu liniju koda pa kompajlirati kod
//    var model = model
//    var color = color
//    var doors=doors
//
//    fun move (){
//        println("Auto se krece.")
//        println("Auto $name se krece.")
//    }
//
//    fun stop(){
//        println("Auto se zaustavio.")
//        println("Auto $name se zaustavio.")
//    }
//}

class Car( var name: String, var model: String, var color: String, var doors:Int ) {
    fun move (){
        println("Auto se krece.")
        println("Auto $name se krece.")
    }

    fun stop(){
        println("Auto se zaustavio.")
        println("Auto $name se zaustavio.")
    }
}
