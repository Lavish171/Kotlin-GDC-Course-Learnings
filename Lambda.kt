
fun main() {
   val prog=Program()
   //prog.addtwonum(2,7){x,y->x+y}
   //we can also write the same statement in the same way as follows as package
   //prog.addtwonum(2,7,{x,y->x+y})
   //we can also write the above statement in one more way as follows as 
   val lambda:(Int,Int)->Int={x:Int,y:Int->x+y}
   prog.addtwonum(2,7,lambda)
}
class Program
{
    fun addtwonum(a:Int,b:Int,action:(Int,Int)->Int)
    {
        val result=action(a,b)
        println("the result is being given by as follows $result")
    }
    
}
