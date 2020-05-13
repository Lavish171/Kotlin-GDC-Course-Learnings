//In Java you cannnot mutate the value of the outside varibles inside the lambdas,but in kotlin you can do that/

fun main() {
   val prog=Program()
   //prog.addtwonum(2,7){x,y->x+y}
   //we can also write the same statement in the same way as follows as package
   //prog.addtwonum(2,7,{x,y->x+y})
   //we can also write the above statement in one more way as follows as 
   val lambda:(Int,Int)->Int={x:Int,y:Int->x+y}//variant 1
    prog.addtwonum(2,7,lambda)
   val outsidevarforlamda=0
    //when the result is the outside variable 
    //->followed by the upper line 
    //In Java you cannnot mutate the value of the outside varibles inside the lambdas,but in kotlin you can do that/
    val lambda:(Int,Int)->Unit={x:Int,y:Int-> outsidevarforlambda=x+y}//variant 2
   print(outsidevarforlambda)
}
class Program
{
    fun addtwonum(a:Int,b:Int,action:(Int,Int)->Unit) //high level function with lambda as the parameter ,
    // a function with lambda as the parameter or the which returns the lambda as the return value is called as the 
   //the high level functions
  
    {
        val result=action(a,b)// for variant 1
        println("the result is being given by as follows $result")
        action(a,b)//when doing this for variant 2
    }
    
}
