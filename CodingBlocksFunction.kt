fun square1(x:Int):Int
{
    return x*x;
}
fun square2(x:Int):Int=x*x
fun square3(x:Int)=x*x
fun main()
{
    var one:Int=square1(4)
    var two:Int=square2(5)
    var three:Int=square3(6)
    print("First function $one \n Second Function $two \n Third Function $three")
}
