/*Write a user defined function to convert lowercase letter to uppercase and call the function using Map*/
import scala.io.StdIn.{readLine}
object HelloWorld
{
 def lowerToUpper(ch:Char):Char=
 {
 if(ch.isLower)
 return(ch.toByte-32).toChar
 else 
 return ch
 }
 
def main(args: Array[String])
{
println("Enter string ")
var str=readLine
var str1 = str.map(lowerToUpper)
println("Changed string is "+str1)
}
}
