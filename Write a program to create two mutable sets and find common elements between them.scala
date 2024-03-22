/*Write a program to create two mutable sets and find common elements between them*/
import scala.collection.mutable.Set
object HelloWorld
{
def main(args: Array[String])
{
// Creating and initializing set
var set1 = Set(1,2,3,4)
 var set2=Set(2,4,5,7)
// Adding new element in set using += 
set2 += 10
 set2 ++== List(4,5,9,3) // 4 and 5 will not get added as duplicate value
 set2.add(13)
set2.add(11)
println("\nSet2 after addition of new elements:")
println(set2)
println("Common elements are "+set1.intersect(set2))
}
}
