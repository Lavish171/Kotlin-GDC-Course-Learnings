
var listofnames= listOf<String>("Lavish","rahul","deepak")
var mutablelist= mutableListOf<String>("Lavish","rahul","deepak")
var mutablearraylist= arrayListOf<Int>(2,3,5,6,12,14)
var hashmap= mapOf<Int,String>(1 to "Rahul",2 to "Lavish",3 to "Raj",4 to "Hari")
var anytype= mapOf(1 to "Simran","Raj" to "Hi","Hello" to "SHyam")
var hashmaping= hashMapOf(2 to "Shyam",4 to "SUnny",7 to "honey")//hashmap is mutable whereas the map is not mutable
fun main()
{
println(listofnames.size)
mutablelist.add("adding the new element")
println("The element in the index at 3 in the mutable list is being given by as ${mutablelist.get(3)}")
mutablearraylist.add(19)
    for(i in mutablearraylist)
    {
        print("$i ")
    }
    println()
    println(hashmap[1])
    println(hashmap[2])
     println(anytype["Raj"])
    hashmaping.set(6, "Lavish")
    println(hashmaping[4])
    
    /* taking around the for each loop*/
     hashmaping.forEach { t, u ->
        print("$t -> $u")
        println()
    }

   mutablearraylist.forEach { print("$it  ")  }
    println()
    listofnames.forEach { print("$it  ") }
    
     println("Traditional for loop")
    for(x in 0..10) print("$x ")  // it will include the x from 0 to 10 ie on printing the values we get 
    //the values from 0 to 10 inclusively
    
    for(x in 0 until 10) print(" $x ") //This will exclude the 10,it would be printed from the 0 to 9
    
    for (x in 10 downTo 0 step 2) print("$x ")
}
