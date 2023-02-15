import kotlin.concurrent.thread
//Les threads permettent d’exécuter plusieurs instructions en même temps
fun main() {
    thread {  for(index in 0..3){
        println("the head 1 $index")
        }
    }
    thread {
        for(index in 0..6){
            println("the head 2 $index")
        }
    }
    thread {
        for(index in 0..10){
            println("the head 3 $index")
        }
    }
}