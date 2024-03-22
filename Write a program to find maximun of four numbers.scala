/*Write a program to find maximun of four numbers*/
import scala.io.StdIn.{readInt}
object HelloWorld
{
    def main(args:Array[String])
    {
        println("Enter number of values : ")
        var n : Int = readInt
        var arr = new Array[Int](n)
        println("Enter values: ")
        for(i<- 0 to arr.length-1)
            arr(i) = readInt
        var max : Int = arr(0)
        for(i<- 0 to arr.length-1)
            if(arr(i)>max)
                max=arr(i)
        println("Maximum = "+max)
    }
}
