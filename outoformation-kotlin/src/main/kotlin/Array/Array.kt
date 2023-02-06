package Array

fun main(){
    /*var a="  hello iman"
    var b=a.length - 1
    println("a[1]"+a[1])
    /*for (index in 0.. b){
        println("[$index]="+a[index])
    }*/
    println(a.toLowerCase())
    println(a.toUpperCase())
    println(a.trim())//supprimer espace
    println(a.split(" "))*/
//filter
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println( decorations.filter {it[0] == 'p'})

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    myList.add("iman")
    println(myList)

    val numbers = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)
}