//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Sav neophodan inicijalizacioni kod se izvršava u posebnom init bloku
     // Višestruki init blokovi su dozvoljeni
   // init blokovi postaju tijelo(body) primarnog konstruktora.
    //klase mozemo kreirati i u zasebnom kotlin file-u
    val user1=User("Amera", "Sinanovic", 30)
    println("User1: ${user1.name},${user1.lastName} ,${user1.age}  ")
    val user2=User("Ema", "Sinanovic", 30)
}

