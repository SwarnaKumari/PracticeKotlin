import Collections.Product

class Wrestler(name:String, age:Int, height:Int, weight:Int){
    var name:String=name
    var age:Int=age
    var height:Int=height
    var weight:Int=weight

}

fun main(args: Array<String>){

    var wrestlers=mutableListOf<Wrestler>()
    wrestlers.add(Wrestler("swarna",22,5,60))
    wrestlers.add(Wrestler("chandini",21,5,255))
    wrestlers.add(Wrestler("anuja",40,5,60))
    println("====wrestlers======")
    for (wrestler in wrestlers) {
            println("${wrestler.name}  ${wrestler.age}  ${wrestler.height} ${wrestler.weight}")
        }

    println("List of wrestlers age greater than 35")
    for(wrestler in wrestlers){
        if(wrestler.age>35){
            println("${wrestler.name}  ${wrestler.age}")
        }
    }
    println("Wrestlers weight greater than 200")
    for(wrestler in wrestlers){
        if(wrestler.weight>200){
            println("${wrestler.name}  ${wrestler.weight}")
        }
    }

}