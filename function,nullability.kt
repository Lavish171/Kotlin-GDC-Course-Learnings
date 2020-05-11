import kotlin.random.Random

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
fun main(args: Array<String>)
{
    var fishes : Int ?=null
    fishes=fishes?.dec() ?:0 //checking for the nullable condition
    print(fishes)
    val a="kotlin"
    val b :String?=null
    print("The length of the strign a is ${a?.length}")
    print("The length of the string b is ${b?.length}")
    feedfish()
}
