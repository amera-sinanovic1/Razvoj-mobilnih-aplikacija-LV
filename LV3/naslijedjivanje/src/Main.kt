//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val car = Car("BMW", "Red", 1, 4 )
    val plane= Plane("AirBus", "white", 4,8)
    car.move()
    car.stop()
    plane.stop()
    plane.move()


}


open class Vehicle(val name: String,val color:String ) {
    open fun move (){
        println("Vozilo $name se krece.")
    }
    open fun stop(){
        println("Vozilo $name se zaustavio.")
    }
}
//Kotlin klase su po defaultu final
class Car(name:String, color:String, val engines:Int, val doors:Int ) : Vehicle(name,color) {
    //override move method from parent class
    override fun move(){
        println("Car is moving")
    }
    override fun stop(){
        println(" Car $name stoped.")
    }

}// This type is final, so it cannot be inherited from

class Plane(name:String, color:String, val engines:Int, val doors:Int ) : Vehicle(name,color){
    override fun move(){
        flying()
        super.move()
    }
    fun flying(){
        println("Plane is flying.")
    }
} // This type is final, so it cannot be inherited from


//class Car (val name:String,val color:String, val engines:String, val doors:Int ) {
//    fun move (){
//        println("Auto $name se krece.")
//    }
//    fun stop(){
//        println("Auto $name se zaustavio.")
//    }
//}
//
//
//class Plane (val name:String,val color:String, val engines:String, val doors:Int ) {
//    fun move (){
//        println("Auto $name se krece.")
//    }
//    fun stop(){
//        println("Auto $name se zaustavio.")
//    }
//}

