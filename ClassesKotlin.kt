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

//The primary constructor has not it's own body ,whereas the secondary constructor  has it's own body
//but we can think the init block has the part of the body of the primary constructor.

