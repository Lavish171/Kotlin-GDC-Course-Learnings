fun main()
{
var student=Student("Lavish")
}

/*class Student(name:String)  //1 way of defining the primary constructor with just parameters
{
    var name="dummy"
    init {
        this.name="Suresh"
        println("The name is ${this.name}")
    }
}*/
class Student(var name:String)//primary constructor with the property
{
    init {
        name="Mukesh"
        println("The name is $name")
    }
}
