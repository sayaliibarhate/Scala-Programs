/*Write a program to count uppercase and convert it to lowercase and display new string*/
import scala.io.StdIn.{readLine}
object HelloWorld 
{
    def main(args: Array[String]) 
    {
        print("Enter a string: ")
        val str = readLine
        var upperCaseCount = 0
        var lowerCaseCount = 0
        for (i <- 0 until str.length) 
        {
            if (str.charAt(i).isUpper) 
            {
                upperCaseCount += 1
            } 
            else if (str.charAt(i).isLower) 
            {
                lowerCaseCount += 1
            }
        }
        println("Uppercase letters: " + upperCaseCount)
        println("Lowercase letters: " + lowerCaseCount)
        val newStr = str.toLowerCase
        println("Changed string: " + newStr)
    }
}
