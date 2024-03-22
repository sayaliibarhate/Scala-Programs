/*Write a program to calculate sum of 1 to n numbers*/
import scala.io.StdIn.{readInt}
object HelloWorld
{
    def sumno(n : Int): Int =
    {
        var sum : Int = 0
        sum = (n*(n+1))/2
        return sum
    }
    def main(args:Array[String])
    {
        println("Enter n : ")
        var n : Int = readInt
        printf("Sum = %d ",sumno(n))
    }
}
