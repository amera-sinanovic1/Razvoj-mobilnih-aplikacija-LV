//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val user1=User("Amera") //greska bez sek. konstruktora
    println("user1 is ${user1.name}, ${user1.lastName}, ${user1.age}")

    val user2=User("Amera", "Sinanovic") //greska bez sek. konstruktora
    println("user1 is ${user2.name}, ${user2.lastName}, ${user2.age}")

    val c1=Circle("krug")
    val c = Circle(3)
}

class User(var name: String, var lastName: String, var age: Int) {
    // sekundarni konstruktori uvijek pozivaju primarni konstruktor
    constructor(name: String) : this(name, "LastName",0){
        println("Sekundarni kontruktor 1.")
    }
    constructor(name: String, lastName:String) : this(name,lastName,0){
        println("Sekundarni kontruktor 2.")
    }
}


