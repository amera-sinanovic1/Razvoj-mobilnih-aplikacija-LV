//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//definira ugovor kojeg se moraju pridržavati sve klase koje implementiraju interface
//Može sadržavati potpise metoda i imena atributa
//Može proizaći iz drugih interfejsa
    val auto = Car("Audi", "A8", 1, 4)
    auto.startEngine()
}

interface Engine {
    //nema konstruktora ()
    fun startEngine()
}

class Car(val name:String, val color:String, val engines:Int, val doors:Int ): Engine {
    override fun startEngine() {
        println("Motor automobila upaljen.")
    }
}

class Truck (val name:String, val color:String, val engines:Int):Engine {
    override fun startEngine() {
        println("Motor traktora upaljen.")
    }
}

class Plane (val name:String, val color:String, val engines:Int):Engine {
    override fun startEngine() {
        println("Motor aviona upaljen.")
    }
}