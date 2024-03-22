/*Define a class student(is,name,course). Define methods accept() and display(). Display details of students of particular course*/
import scala.io.StdIn.{readInt, readLine}
class Student(id : Int, name : String, course : String)
{
    def getName() : String = return name
    def getCourse() : String = return course
    
    override def toString() = s"ID=$id Name=$name Course=$course"
}
object HelloWorld
{
    def main(args:Array[String])
    {
        println("Enter number of students: ")
        var n : Int = readInt
        var arr = new Array[Student](n)
        println("Enter student details: ")
        for(i<- 0 to n-1)
        {
            println("Enter id, name, course name: ")
            var id = readInt
            var name = readLine
            var course = readLine
            arr(i) = new Student(id,name,course)
        }
        println("Enter course name to be searched: ")
        var cname = readLine
        println(s"The students belonging to $cname course are: ")
        for(i<- 0 to n-1)
        {
            if(arr(i).getCourse().equals(cname))
                println(arr(i).getName())
        }
    }
}
