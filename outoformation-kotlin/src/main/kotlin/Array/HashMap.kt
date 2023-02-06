package Array

fun main(){
    var listOfUsers = HashMap<Int,String>()
    listOfUsers[123]= "iman"
    listOfUsers[12]= "ilham"
    listOfUsers[18]= "mehdi"

    listOfUsers[12]= "ilham najim"

    for (key in listOfUsers.keys)
        println("$key: ${listOfUsers[key]}")
}