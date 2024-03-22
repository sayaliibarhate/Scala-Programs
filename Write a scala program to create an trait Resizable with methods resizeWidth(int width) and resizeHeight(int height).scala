/*Write a scala program to create an trait Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create anther trait Drawable with a method draw() that takes no arguments and returns void. Create a class Rectangle that extends the Resizable and Drawable traits and implements the abstract methods*/
trait Resizable
{
 def resizeWidth(width:Int):Unit
 def resizeHeight(height:Int):Unit
}
trait Drawable
{
 def draw()
}
class Rectangle extends Resizable with Drawable
{
 private var height: Int=0
 private var width : Int = 0
 def this(height:Int,width:Int)
 {
 this()
 this.height=height; 
 this.width=width;
 }
 override def toString():String=return s"\nHeight =  $height \nWidth = $width";
 
 def resizeWidth(width:Int)=this.width=width;
 
 def resizeHeight(height:Int)= this.height=height;
 
 def draw()=println("Rectangle is drawn.");
}
object HelloWorld
{
 def main(args : Array[String]) 
 { 
 var r=new Rectangle(23,12);
 println("\nRectangle dimesion is \n"+r);
 r.draw();
 r.resizeWidth(45);
 r.resizeHeight(15);
 println("\nRectangle new dimesion is \n"+r);
 }
}
