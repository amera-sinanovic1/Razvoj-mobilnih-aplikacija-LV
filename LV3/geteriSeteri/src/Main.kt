//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //ENKAPSULACIJA
    //Ako ne želite default get/set ponašanje:
    //Override get() za atribut
    //Override set() za atribut ako je definiran kao var)
    //Moraju se definasti odmah nakon property-a

    val user2=User("Amera", "Sinanovic",30)
    print(user2.firstName) // geter pozvan
    user2.firstName="Merima" // seter poyvan


}

class User(firstName: String="Ime", var lastName: String="Prezime", var age: Int=0) {
    var firstName=firstName
        get()  {
            return "First name is: $field"
        }
        set(value) {
            println("Value $value is assigned to $firstName")
            field = value
        }
}


