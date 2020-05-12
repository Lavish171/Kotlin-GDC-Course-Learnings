import kotlin.random.Random
//In this we would demontrate the usage of the function and nullability condition and the use of the when condition
// ***The when statement is similar to switch in other programming languages, but when automatically breaks at the end of each branch.
fun feedfish()
{
    val day=randomDay()
    val cookie="Pizza"
    println("The random day is $day and cookie is $cookie")
}
fun randomDay():String
{
   val week= arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Sat","Sunday")
    return week[Random.nextInt(week.size)]
}
fun fishfood(day:String):String
{
    var food=""
    when(day)
    {
        "Monday"->food="nuts"
        "Tueday"->food="peas"
        "Wednesday"->food="onions"
        "Thursady"->food="papaya"
    }
    return food
}
fun fishfood(day:String):String //function with the else condition also written in when block (same as default in java)
{
    var food=""
    when(day)
    {
        "Monday"->food="nuts"
        "Wednesday"->food="onions"
        "Thursady"->food="papaya"
        else ->food="NOhting is being selected"
    }
    return food
}

fun fishfood(day:String):String //function with the direct return statement ,with also the else block,acting 
//just like the upper function
{
   return  when(day)
    {
        "Monday"->"nuts"
        "Wednesday"->"onions"
        "Thursady"->"papaya"
        else ->"NOhting is being selected"
    }
}

//date 12 May 2020
//function in kotlin witht the default parameter and also withotut it
fun changewater(day:String,temp:Int=26,dirty:Int=35):Boolean
{
    return when
    {
        temp>30->true
        dirty>40->true
        day=="Sunday"->true
        else ->false
    }
}

fun swim(speed: String = "fast") {
   println("swimming $speed")
}

fun main(args: Array<String>)
{
    var fishes : Int ?=null
    fishes=fishes?.dec() ?:0 //checking for the nullable condition
    print(fishes)
    val a="kotlin"
    val b :String?=null
    println("The length of the strign a is ${a?.length}")
    println("The length of the string b is ${b?.length}")
    feedfish()
     val randomday=randomDay()
    val food=fishfood(randomday)
    println("Today is $randomday & are we are eating food $food")
    
    var istrue:Boolean=changewater("Munday")
    println(istrue)
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")   // named parameter
}
