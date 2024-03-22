/*Write a function to check whether given number is Armstrong or not*/
import scala.io.StdIn.{readInt}
object HelloWorld 
{
  def Armstrong(n: Int): Boolean = 
  {
    val cnt: Int = (n.toString).length()
    var sum: Int = 0
    var n1: Int = n
    while (n1 != 0) 
    {
      sum = sum + math.pow(n1 % 10, cnt).toInt
      n1 = n1 / 10
    }
    if (sum == n)
      return true
    false
 }

  def main(args: Array[String]) {
    println("Enter n:")
    var n: Int = readInt
    if (Armstrong(n))
      println("Armstrong number!")
    else
      println("Not Armstrong number!")
  }
}
