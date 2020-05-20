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
    
    //see below you will surely learn a lot
    val experiment=Array(6,{i->i*2})
    println(experiment[2])
    println(experiment[4])
    val arr= intArrayOf()
    for(i in arr)
    {
        print("$i ")
    }
    println()
    val nullarray= arrayOfNulls<String>(10)
    for(i in nullarray)
    {
        print("$i  ")
    }
    println()
    arr.set(2,21)
    print("new array is ")
    for(i in arr)
    {
        print("$i ")
    }

}
