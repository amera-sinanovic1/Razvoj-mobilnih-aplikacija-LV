//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val View1 = View()
    val button = Button("Log in", " Center")
    val roundButton = RoundButton("Sign up", "Left", 90)
    View1.draw()
    button.draw()
    roundButton.draw()

}

open class View() {
    open fun draw() {
        println("Drawing the view.")
    }
}

open class Button(val text: String, val Orientation: String) : View() {
    override fun draw() {
        println("Drawing the button.")
        super.draw()
    }

}

class RoundButton(text: String, Orientation: String, val corners: Int) : Button(text, Orientation) {
    override fun draw() {
        println("Drawing the round button.")
        super.draw()
    }
}