fun main() {

    var lamda:(Int)->String = { age ->
        if (age <= 18) "Non adult"
        else if (age >= 18 && age <= 55) "Adult"
        else "Senior citizen"
    }
    println("${lamda(60)}")

}