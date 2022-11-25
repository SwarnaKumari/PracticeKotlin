fun main(){
    println("Numbers divisible by 3 and 5 are:")
    var count=0
    for(i in 1..100){
        if(i%3==0 && i%5==0){
            count+=1
            println(i)
        }
    }
    println("$count numbers are divisible by 3 and 5")
}
