/*Write a program to accept a matrix and display transpose of it.*/
import scala.io.StdIn.{readInt}
object HelloWorld
{ 
    def main(args: Array[String]) 
    { 
        print("Enter number of rows: ")
        val rows = readInt
        print("Enter number of columns: ")
        val cols = readInt
        
        val m= Array.ofDim[Int](rows,cols)
        
        println("Enter the matrix elements of matrix: ")
        for(i<-0 until rows)
        {
            for(j<-0 until cols)
            {
                m(i)(j)=readInt();
            }
        }
        println("Tranpose is: ")
        for(j<-0 until rows)
        {
            for(i<-0 until cols)
            {
                print(m(i)(j)+"\t")
            }
        }
    }
}
