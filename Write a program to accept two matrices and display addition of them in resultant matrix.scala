/*Write a program to accept two matrices and display addition of them in resultant matrix*/
import scala.io.StdIn.{readInt}
object HelloWorld
{ 
    def main(args: Array[String]) 
    { 
        print("Enter number of rows: ")
        val rows = readInt
        print("Enter number of columns: ")
        val cols = readInt
        
        val m1= Array.ofDim[Int](rows,cols)
        val m2= Array.ofDim[Int](rows,cols)
        
        println("Enter the matrix elements of first matrix: ")
        for(i<-0 until rows)
        {
            for(j<-0 until cols)
            {
                m1(i)(j)=readInt();
            }
        }
        println("Enter the matrix elements of second matrix: ")
        for(i<-0 until rows)
        {
            for(j<-0 until cols)
            {
                m2(i)(j)=readInt();
            }
        }
        
        val rm= Array.ofDim[Int](rows,cols)
        for(i<-0 until rows)
        {
            for(j<-0 until cols)
            {
                rm(i)(i)=m1(i)(j)+m2(i)(j)
            }
        }
        
        println("Resultant matrix is: ")
        for(i<-0 until rows)
        {
            for(j<-0 until cols)
            {
                print(rm(i)(i)+"\t")
            }
        }
    }
}
