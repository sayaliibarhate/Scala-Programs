/*Write abstract class shape containing three data members of type dim1, dim2, dim3 and 3 abstract methods(area,volume,perimeter). Also define 3 sub classes circleshape, rectangleshape, coneshape*/
import scala.io.StdIn.{readInt,readLine,readFloat}
abstract class Shape(dim1:Float,dim2:Float,dim3:Float)
{
    final val pi:Float=3.142f
    def area():Float
    def volume():Float
    def perimeter():Float
}
class CircleShape(dim1:Float) extends Shape(dim1,0.0f,0.0f)
{
    def area():Float=return(pi*dim1*dim1)
    def volume():Float=return 0.0f
    def perimeter():Float=return(2*pi*dim1)
}
class RectangleShape(dim1:Float,dim2:Float) extends Shape(dim1,dim2,0.0f)
{
    def area():Float=return(dim1*dim2)
    def volume():Float=return 0.0f
    def perimeter():Float=return(2*dim1*dim2)
}
class ConeShape(dim1:Float,dim2:Float,dim3:Float) extends Shape(dim1,dim2,dim3)
{
    def area():Float=return(pi*dim1*dim2)+(pi*dim1*dim2)
    def volume():Float=return (0.33f*pi*dim1*dim2*dim3)
    def perimeter():Float=return(2*dim1*dim2)
}
object HelloWorld
{
    def main(args:Array[String])
    {
        var circle=new CircleShape(3.5f)
        println("Area of Circle: "+circle.area)
        println("Perimeter of Circle: "+circle.perimeter)
        
        var rectangle=new RectangleShape(4.5f,5.5f)
        println("Area of Reactangle: "+rectangle.area)
        println("Perimeter of Rectangle: "+rectangle.perimeter)
        
        var cone=new ConeShape(5.5f,6.6f,7.7f)
        println("Area of Cone: "+cone.area)
        println("Volume of Cone: "+cone.volume)
        println("Perimeter of Cone: "+cone.perimeter)
    }
}
