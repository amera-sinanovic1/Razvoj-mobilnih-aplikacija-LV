//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val user1=User("Amera") //greska bez sek. konstruktora
    println("user1 is ${user1.name}, ${user1.lastName}, ${user1.age}")

    val user2=User("Amera", "Sinanovic") //greska bez sek. konstruktora
    println("user1 is ${user2.name}, ${user2.lastName}, ${user2.age}")


}

class User(var name: String="Ime", var lastName: String="Prezime", var age: Int=0) {

}


