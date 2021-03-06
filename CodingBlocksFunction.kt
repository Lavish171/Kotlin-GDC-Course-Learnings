fun square1(x:Int):Int
{
    return x*x;
}
fun square2(x:Int):Int=x*x
fun square3(x:Int)=x*x

fun showmeuser(name:String,age:Int=18,con:Boolean=false)
{
    println("Name is $name and the age is $age and the con is $con")
}

fun variablearguements(vararg  num:Int) //VARARGS ,variable arguements
{
    println(num.size)
    for (i in num)
    {
        print(" $i ");
    }
    println()
}

fun main()
{
    var one:Int=square1(4)
    var two:Int=square2(5)
    var three:Int=square3(6)
    print("First function $one \n Second Function $two \n Third Function $three")
    showmeuser("lavish",20,true)
    showmeuser(age=21,con=true,name="lavish")  //special thing in the kotlin is the named parameter ie //👈👈
    //in this we do not need remeber  or care about the positions of the arguements that we are passing
    showmeuser("lavish",con=true,age=15) //mix and match also going to work //👈👈
    
    //☝☝☝ all the three version of  the function showmeuser are going to work in the same manner
    
    showmeuser(con=true,age=17,"Pulkit") //this would not work as we cannnot use the positional argument , //👎⚔✂
    //once we have used the named arg  
    variablearguements(1,2,3,4,5,5,6,6,1,19)
    
    
}
