fun main(){
    //if else
    print("Enter your age: ")
    val age = readLine()!!.toInt()


    if(age>= 90){
        println("A")
    } else if(age ==1 || age ==2){
        println("B")
    }else if(age in 70..79){
        println("C")
    }else {
        println("e")
    }
    //when
    print("Enter number: ")
    val number = readLine()!!.toInt()
    when(number){
        1->{print("number est 1")}
        2,3->{print("number est entre 2 or 3")}
        in 20..30->{print("number est between 20 et 30")}
        !in 20..30->{print("number not between 20 et 30")}
        else->{
            print("out")
        }
    }
    //loop for
    for(item in 1..10){
        println("hello ma belle iman")
    }
    for (i in 1..10 step 2){
        println("Counter $i")
    }*/
    for(item in 1..10){
        println("hello")
        if(item==8){
            continue
        }
        else if(item==9){
            break
        }
    }
    println("hello ma belle iman")
    //while and do while
    var i=11
    while (i<=10){

        println("Counter $i")
        i += 2
    }
    println("Do While Loop")
    i= 11
    do{
        println("Counter $i")
        i += 2

    }while (i<=10)
}