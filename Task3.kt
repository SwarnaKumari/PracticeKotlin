import java.util.*
fun main(args: Array<String>){
     var sc=Scanner(System.`in`)
    println("Enter amount")
    var amount=sc.nextInt()
    println("Enter account number")
    var accno=sc.nextInt()
    println("Enter balance")
    var balance=sc.nextInt()
    println("Enter account type")
    var accountType=sc.next()
    var acc=Account(amount,accno,balance,accountType)
    println("Enter your choice\n1.withdraw\n2.deposit\n3.calculate rate of intrest\n4.get balance")
    var choice=sc.nextInt()
    when(choice){
        1->acc.withdraw()
        2->acc.deposit()
        3->acc.calRateOfIntrest()
        4->acc.getbalance()
        else->println("Invalid option")
    }
}
class Account(amount:Int,accno:Int,balance:Int,accountType:String){

    var amount:Int=amount
    var accno:Int=accno
    var balance:Int=balance
    var accountType:String="accountType"
    fun withdraw(){
        println("Balance=$balance")
          balance-=amount
        println("After withdraw remaining balance=$balance")
    }
    fun deposit(){
        println("Balance=$balance")
        balance+=amount
        println("After deposit total balance=$balance")
    }
    fun calRateOfIntrest(){
        if(accountType=="savings"){
            var intrest=balance*0.06
            println("Rate of intrest=$intrest")
        }
        else{
            var intrest=balance*0.1
            println("Rate of intrest=$intrest")
        }
    }
    fun getbalance(){
        if(accountType=="savings"){
            var intrest=balance*0.06
            var totalbalance=intrest+balance
            println("Total balance=$totalbalance")
        }
        else{
            var intrest=balance*0.1
            var totalbalance=intrest+balance
            println("Total balance=$totalbalance")
        }
    }

}