/*Write a class player(pno,pname,page) and define two subclasses extending player class – cricketplayer(no of innings,batting avg,balling avg) and football(no of matches,no of goals). Accept the details of n players and display it having batting avg gt 50 and football player scoring more than 50 goals*/
import scala.io.StdIn.{readInt,readLine,readFloat}
class Player
{
    private var pno:Int=0
    private var pname:String=null
    private var age:Int=0
    def this(pno:Int,pname:String,age:Int)
    {
        this()
        this.pno=pno
        this.pname=pname
        this.age=age
    }
    
    override def toString()=s"Player No=$pno Name=$pname Age=$age"
    def getPname():String=return pname
}
class CricketPlayer(pno:Int,pname:String,age:Int,no_innings:Int,batavg:Float,ballavg:Float)extends Player(pno,pname,age)
{
    override def toString()=super.toString()+s"No of innings=$no_innings Batting average=$batavg Balling average=$ballavg"
    def getBatavg():Float=return batavg
}
class FootBallPlayer(pno:Int,pname:String,age:Int,no_matches:Int,goals:Int)extends Player(pno,pname,age)
{
     override def toString()=super.toString()+s"No of matchess=$no_matches Goals=$goals" 
     def getgoals():Int=return goals
}


object HelloWorld {
   def main(args: Array[String]) {
       println("Enter no of players:")
       var n:Int=readInt()
       val arr=new Array[Player](n)
       println("Enter player details:")
       for(i<-0 to n-1)
       {
           println("Enter a player No,name,age")
           var pno:Int=readInt()
           var pname:String=readLine()
           var age:Int=readInt()
           println("Enter 1 for cricket player,2 for Football player")
           var choice:Int=readInt
           if(choice==1)
           {
               println("Enter no of innings,batting,balling average:")
               var noinnings=readInt
               var batavg=readFloat
               var ballavg=readFloat
               arr(i)=new CricketPlayer(pno,pname,age,noinnings,batavg,ballavg)
           }
           else if(choice==2)
           {
               println("Enter no of matches,goals")
               var no_matches=readInt
               var goals=readInt
               arr(i)=new FootBallPlayer(pno,pname,age,no_matches,goals)
           }}
           println("Player names having batting average>50")
           
           for(i<-0 to n-1)
           {
               if(arr(i).getClass.getName().equals("CricketPlayer")&&
               (arr(i).asInstanceOf[CricketPlayer]).getBatavg()>50)
               println(arr(i).getPname)
           } 
           println("Player names scoring more than 50 goals")
           for(i<-0 to n-1)
           {
               if(arr(i).getClass().getName().equals("FootBallPlayer")&& (arr(i).asInstanceOf[FootBallPlayer]).getgoals()>50)
               println(arr(i).getPname)
               
           }
       }
   }
