class ToBeCalled {
    fun callMe() = println("You are calling me :)")
}
fun main(args: Array<String>) {     
    val obj = ToBeCalled()
    
    // calling callMe() method using object obj
    obj.callMe()
}

The static keyword
In some language like Java and C#, we use static keyword to declare the members
of the class and use them without making any object i.e. just call them with the
help of class name. So, to call a method named myMethod() and the class name is MyClass, 
then the method will be called by:

MyClass.myMethod();
But can we do the same i.e. call the members of the class with the help of class name
in Kotlin? The answer is yes, but the approach is different. There is nothing called    //👈👈👈👀👀👈
static in Kotlin. So, in Kotlin, we use a companion object

✨HOW TO CREATE THE COMPANION OBJECT✨
👇👇
class CompanionClass {

    companion object {

    }
}
val obj = CompanionClass.Companion

So, following is the example of companion object in Kotlin:

class ToBeCalled {
    companion object Test {
        fun callMe() = println("You are calling me :)")
    }
}
fun main(args: Array<String>) {
    ToBeCalled.callMe()
}  ☝☝👈
