package Array

fun main(){
    println("list")
    print("Enter number of list: ")
    val maxSize = readLine()!!.toInt()
    //Write App in Array
    var listOfPets:Array<String> = Array(maxSize){""}
    for(i in 0 until  maxSize){
        print("Enter Pet name $i:")
        listOfPets[i] = readLine()!!.toString()
    }

    println("Your pets Are using Array")
    for(i in 0 until maxSize){
        println("Pet $i:  ${listOfPets[i]}")
    }
}