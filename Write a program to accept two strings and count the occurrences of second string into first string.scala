/*Write a program to accept two strings and count the occurrences of second string into first string*/
import scala.io.StdIn.{readInt,readLine}
object HelloWorld
{
   def main(args: Array[String]): Unit=
   {
      println("Enter a string")
      var a=readLine()
      println("Enter another string to searched:")
      var b=readLine()
      var count=0
      for(i<-0 to a.length-b.length)
      {
          if(a.substring(i,i+b.length)==b)
          {
              count=count+1
              
          }
      }
      println("Number of occurrences: "+count)
   }
}
