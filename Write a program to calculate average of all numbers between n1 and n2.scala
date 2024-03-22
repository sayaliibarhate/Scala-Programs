/*Write a program to calculate average of all numbers between n1 and n2(eg.100 and 300 Read values of n1 and n2 from user)*/
import scala.io.StdIn.{readInt,readFloat}
object HelloWorld
{
    def main(args:Array[String])
    {
        println("Enter n1 and n2: ")
        var n1 : Int = readInt
        var n2 : Int = readInt
        if(n1>n2)
        {
            var temp = n1
            n1 = n2
            n2 = temp
        }
        var sum : Int = 0
        for(i<- n1 to n2)
            sum = sum + i
        println("Sum= "+sum)
        var n = (n2-n1)
        var avg : Float = sum/n
        println("Average= "+avg)
    }
}
