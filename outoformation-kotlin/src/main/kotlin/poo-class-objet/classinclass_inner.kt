package poo
//Une classe imbriquée marquée comme innerpeut accéder aux membres de sa classe externe.
// Les classes internes portent une référence à un objet d'une classe externe
class class1{
    var nom:String="iman"
    inner class class2{
        fun getmsg():String{
            return "hello iman"
        }
    }
    class class3{
        fun getmsg():String{
            return "hello class3"
        }
    }
}
fun main(){
    var a=class1().class2().getmsg()
    var b=class1.class3().getmsg()
    //println(a.getmsg())
    println(a)
    println(b)
}