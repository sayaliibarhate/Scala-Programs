/*Write a program to find factorial of a number*/
import scala.io.StdIn.{readInt}
object HelloWorld
{
    def main(args:Array[String])
    {
        println("Enter number : ")
        var num : Int = readInt
        var fact : Long = 1
        for(i<- 1 to num)
            fact = fact * i
        println("Fact = "+fact)
    }
}

