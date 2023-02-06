package function

fun addNumbers(x:Double=0.0, y:Double=0.0):Double{

    return x+y
}
fun mylist( vararg  names:String){
    for(name in names){
        println(name)
    }
}
fun main(){
    println(" Start Main Fun")
    var returnAdd= addNumbers( 3.0, 4.0)
    println("returnAdd: $returnAdd")

    returnAdd= addNumbers(x=5.0,y=12.0)
    println("returnAdd: $returnAdd")

    mylist( names = *arrayOf("iman","ilham","mehdi"))

    val listOfNumbers = listOf(10,15,22,34,80)
    println("list: $listOfNumbers")
    println("End Main Fun")

}