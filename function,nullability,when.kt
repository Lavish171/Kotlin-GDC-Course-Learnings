import kotlin.random.Random
//In this we would demontrate the usage of the function and nullability condition and the use of the when condition
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
}
