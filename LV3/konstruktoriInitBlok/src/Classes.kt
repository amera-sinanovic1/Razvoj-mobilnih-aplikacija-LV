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

class User(name: String, var lastName: String, var age: Int) {
    //kada u konstruktoru imamo vise od jedne linije koda treba nam init blok
    // name property a ne parametar jer radimo provjeru
    //da li ime pocinje sa a
    var name: String
    init {
        if (name.lowercase().startsWith("a")){
            this.name = name
        }

        else {
            this.name = "User"
            println("Ime ne pocinje sa slovom a ili A")
        }
    }
}