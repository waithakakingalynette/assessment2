fun main() {
    randomString()

    multiples(48)
    multiples(72)
    multiples(105)
    multiples(200)
    var currentammount=CurrentAccount(243122,"Linah Wanjiru",20000)
     println( currentammount.deposit(50000.00,+ 20000))

     // println(x)

   println( currentammount.withdrawn(2000.00,- 20000))


}

//1. Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.

fun randomString(){
    var stmt="The world has changed"
    println(stmt.first())
    println(stmt.last())
    println(stmt.length)
    println("does not start with a vowel")

}

//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
fun word(password:String,num:Int){
    var length=8
//    for (word in password >= length){
//
//        println("valid")
//    }

}


//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”
fun multiples(num:Int){

// for (num in   0 -> 10) {

   //}
  if (num %6 ==0 && num%8 ==0){
      println("Bingo")
   }
    else if (num % 6 !=0 && num % 8 !=0){
        println(num)
  }
}

//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”
 open class CurrentAccount(val account_number:Int,val account_name:String,val balance:Int){

    fun deposit(amount:Double,balance: Int){
       // var x=deposit(50000.00 ,+20000)


    }

    fun withdrawn(amount: Double,balance: Int){

    }

    fun details(){
        println(" Account number ${account_number} with balance ${balance} is operated by ${account_name}")

    }

}


//5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal
class SavingsAccount(val withdrawals:Int,account_number: Int,account_name: String,balance: Int){
    fun withdraw(nums:Int){

//     for(withdrawls in ;0 ->4                                            {
//
//        }
    }
}