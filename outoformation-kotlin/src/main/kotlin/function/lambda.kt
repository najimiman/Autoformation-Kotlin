package function
//Un lambda est une expression qui fait une fonction.
// Mais au lieu de déclarer une fonction nommée, vous déclarez
// une fonction qui n'a pas de nom
val sum = {number1:Int, number2: Int ->
    number1 +number2
}

fun main() {
    val addNumbers =  sum(3,4)
    println("addNumbers:  $addNumbers")
    println("List of numbers ")
    val listOfNumbers = listOf(10,15,22,34,80)

    // normal for loop
    //for (number in listOfNumbers){
    //    println(number)
    // }
    listOfNumbers.forEach {number ->
        println(number)
    }

}