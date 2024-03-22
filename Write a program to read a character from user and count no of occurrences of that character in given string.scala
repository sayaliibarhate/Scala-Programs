/*Write a program to read a character from user and count no of occurrences of that character in given string*/
import scala.io.StdIn.{readLine,readChar}
object HelloWorld 
{
    def main(args: Array[String]): Unit = 
    {
        print("Enter a string: ")
        val s1 = readLine
        print("Enter a character to be searched: ")
        var ch = readChar
        val count = s1.count(c => c == ch)

    // Print the result
    println(s"The number of occurrences of the character $ch in the string $s1 is $count")
  }
}
