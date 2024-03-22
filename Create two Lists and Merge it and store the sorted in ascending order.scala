/*Create two Lists and Merge it and store the sorted in ascending order*/
object HelloWorld
{ 
// Main method 
def main(args:Array[String]) 
{ 
// Creating Lists 
val fruits = List("Mango", "Grapes", "Banana") 
val flowers = List("Rose", "Lili", "Lotus", "Daisy")
// Merging Lists using ++
val list1 = fruits ++ flowers 
println("After merging lists using ++, sorted list is ") 
println(list1.sorted) 
// Merging Lists using :::
val list2 = fruits ::: flowers 
println("After merging lists using ::: , sorted in ascending order is ") 
println(list2.sortWith(_ < _) ) // sort in ascending order
// Merging Lists using concat
val list3 = List.concat(fruits,flowers) 
println("After merging lists using concat , sorted in descending order is ") 
println(list3.sortWith(_ > _) ) // sort in descending order
}
}
