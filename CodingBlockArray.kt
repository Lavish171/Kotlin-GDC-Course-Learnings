fun main()
{
    var numbers= arrayOf(1,2,3,4,5)
    var mix= arrayOf(1,2,3,4,"Lavish","hi fi")//can contains both
    var Stringonly= arrayOf("Lavish","is ","a","good","boy") //strictly contains only strings 
    for(i in numbers)
    {
        print("$i ")
    }
    println()
    for(i in Stringonly)
    {
        print("$i ")
    }
    println()

}
