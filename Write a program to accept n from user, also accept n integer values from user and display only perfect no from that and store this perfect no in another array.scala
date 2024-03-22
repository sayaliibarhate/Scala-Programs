/*Write a program to accept n from user, also accept n integer values from user and display only perfect no from that and store this perfect no in another array*/
import scala.io.StdIn.{readInt}

object HelloWorld 
{
  def perfect(n: Int): Boolean = 
{
    var sum = 0
    for (i <- 1 to n / 2) 
    {
      if (n % i == 0)
        sum = sum + i
    }
    sum == n
  }

  def main(args: Array[String]): Unit = 
  {
    println("Enter n:")
    var n: Int = readInt()
    var arr = new Array[Int](n)
    
    println("Enter numbers:")
    for (i <- 0 until n)
      arr(i) = readInt()

    var arr1 = new Array[Int](n)
    var j: Int = 0

    for (i <- 0 until n) {
      if (perfect(arr(i))) {
        arr1(j) = arr(i)
        j += 1
      }
    }

    println("Perfect numbers are:")
    for (i <- 0 until j)
      println(arr1(i))
  }
}
