lateinit var num:String//it is also called as the late initialsation ,
//in this we have to mention the type of the varible
var checking:String?=null
fun main()
{
num="Lavish Garg"
    println(num)
    var len:Int?=checking?.length
    //since we know that checking can be null and cannnot be null
    //so we can provide a check ie when calculating the length of the checking

    // *** VIMP ****//
    /*  The not-null assertion operator, !! (double-bang), converts any value to a non-null type and
    throws an exception if the value is null. */

    //for info refer the site :- https://codelabs.developers.google.com/codelabs/kotlin-bootcamp-basics/#3//
    //if we do not want the exceptions ie the null pointer exceptions then what we have to do is that we have to
    //initialise the varibale which we can do so by like checking ="Garg is a good boy"
    var size:Int=checking?.length!!
    print(size)//this is same as Java when we want to work with the null pointer exceptions

    //ELVISH OPERATOR
    var newlen:Int?=checking?.length ?:0
    print("THe length using the elvish operator is $newlen")
    //ans would be 0  in this case
   
    //if you want to use any property ie you want to print the length of the propperties of any object or any var 
    // then you can use it within the string by using the curly brackets {} ie ${variable.length} 
    
      print("The length of the num is ${num.length}")
    
      //capitalize capitals the first letter of the string
    println("After the capitalisation of the string we have ${num.capitalize()}  ")

    print("After the new capitalization we have"+ num.capitalize() +" and length is "+num.length)

}
