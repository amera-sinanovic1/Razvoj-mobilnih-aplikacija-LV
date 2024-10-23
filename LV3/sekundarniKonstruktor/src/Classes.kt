//klasa

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

class Circle(val radius:Double) {
    constructor(name:String) : this(1.0) {
        println("Sekundarni konstruktor string-->1.0")
    }
    constructor(diameter:Int) : this(diameter / 2.0) {
        println("in diameter constructor")
    }
    init {
        println("Area: ${Math.PI * radius * radius}")
    }
}