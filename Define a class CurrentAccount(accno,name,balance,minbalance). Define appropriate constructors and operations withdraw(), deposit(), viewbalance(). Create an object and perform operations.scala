/*Define a class CurrentAccount(accno,name,balance,minbalance). Define appropriate constructors and operations withdraw(), deposit(), viewbalance(). Create an object and perform operations.*/
class CurrentAccount(var accNo: Int, var name: String, var balance: Double, var minBalance: Double) {
  def withdraw(amount: Double): Unit = {
    if (balance - amount >= minBalance) {
      balance -= amount
      println(s"Withdrawal of $amount successful. Remaining balance: $balance")
    } else {
      println("Insufficient funds. Withdrawal failed.")
    }
  }

  def deposit(amount: Double): Unit = {
    balance += amount
    println(s"Deposit of $amount successful. New balance: $balance")
  }

  def viewBalance(): Unit = {
    println(s"Account Balance: $balance")
  }
}

object HelloWorld {
  def main(args: Array[String]): Unit = {
    var account: CurrentAccount = null

    var choice = 0
    do {
      println("\n1. Create Account")
      println("2. Withdraw")
      println("3. Deposit")
      println("4. View Balance")
      println("5. Exit")
      print("Enter your choice: ")

      choice = scala.io.StdIn.readInt()

      choice match {
        case 1 =>
          print("Enter Account Number: ")
          val accNo = scala.io.StdIn.readInt()
          print("Enter Name: ")
          val name = scala.io.StdIn.readLine()
          print("Enter Initial Balance: ")
          val initialBalance = scala.io.StdIn.readDouble()
          print("Enter Minimum Balance: ")
          val minBalance = scala.io.StdIn.readDouble()

          account = new CurrentAccount(accNo, name, initialBalance, minBalance)
          println("Account created successfully!")

        case 2 =>
          if (account != null) {
            print("Enter withdrawal amount: ")
            val amount = scala.io.StdIn.readDouble()
            account.withdraw(amount)
          } else {
            println("Please create an account first.")
          }

        case 3 =>
          if (account != null) {
            print("Enter deposit amount: ")
            val amount = scala.io.StdIn.readDouble()
            account.deposit(amount)
          } else {
            println("Please create an account first.")
          }

        case 4 =>
          if (account != null) {
            account.viewBalance()
          } else {
            println("Please create an account first.")
          }

        case 5 =>
          println("Exiting program. Goodbye!")

        case _ =>
          println("Invalid choice. Please enter a valid option.")
      }
    } while (choice != 5)
  }
}
