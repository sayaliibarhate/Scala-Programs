/*Write a program to convert decimal to binary*/
import scala.io.StdIn.{readInt}
object HelloWorld
{
    def decimaltobinary(n : Int): Unit =
    {
        if(n!=0)
        {
            decimaltobinary(n/2)              //octal n/8
            printf("%d",n%2)                     //octal n%8
        }
    }
    def main(args:Array[String])
    {
        println("Enter n : ")
        var n : Int = readInt
        decimaltobinary(n)

    }    
}
