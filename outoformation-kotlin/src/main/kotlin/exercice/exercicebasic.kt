fun main(){
    println("exercice étoiles ****")
    println("entre un nombre de linge")
    var n:Int= readLine()!!.toInt()
    for(index in 0..n-1){
        for(i in 1..index +1){
            print("*")
        }
        println()
    }
}