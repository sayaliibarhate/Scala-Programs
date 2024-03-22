/*Write a program to read 5 random number and check that random numbers are prime or not*/
import scala.io.StdIn.{readInt}
object HelloWorld
{
    def checkprime(n:Int):Boolean =
    {
        if(n==2 || n==3)
            return true
        if(n%2==0)
            return false
        for(i<- 3 to n/2 by 2)
        {
            if(n%i==0)
                return false
        }
        return true
    }
    def main(args:Array[String])
    {
        println("Enter n: ")
        var n : Int = readInt
        var rand = new scala.util.Random
        for(i<- 1 to n)
        {
            var num = rand.nextInt(100)
            if(checkprime(num))
                println(num+" is a prime number!")
            else
                println(num+" is not a prime number!")
        }
    }
}
