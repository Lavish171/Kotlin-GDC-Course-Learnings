fun main()
{
    var one:String="hi "
    val two:String="lavish "
    val three:String="garg"
    one=one.add(two,three)
    println(one)

    //one more example
    val x:Int=7
    val y:Int=19
    println("Greater value is ")
    val ans=x.greatervalue(y)
    println("The greater value is $ans")
}
fun String.add(two:String,three:String):String //extension function of add
{
    //now this extension function has becomed a part of the String class
    //everything in the kotlin is object
    return this+two+three
}

fun Int.greatervalue(y:Int):Int
{
    if(this>y) return this
    else return y
}
