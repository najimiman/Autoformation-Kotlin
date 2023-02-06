package function

fun  add(number1:Int, number2:Int):Int{
    return number1+number2
}
fun  add(number1:Int, number2:Int,number3:Int):Int{
    return number1+number2+ number3
}

fun  add(test1:String, test2:String,test3:String, test4:String):String{
    return test1+" "+test2+" "+test3+" "+test4
}
fun main(){

    println( add(3,4))
    println( add(3,4,10))
    println( add("iman","najim","ilham","najim"))
}