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

//✨✨👉👉THE BODY OF THE SECONDARY CONSTRUCTOR IS BEING CALLED AFTER THE INIT BLOCK.👈👈👈✨✨  //

//FOR SECONDARY CONSTRUCTOR//
✨✨👀👀👇👇👉
fun main()
{
var student=Student("Lavish",13)
    println(student.id)
}

class Student(var name:String)//defining the property within the class ie within the contructor
{
    var id:Int=-1;
    init {
        println("The name is $name")

    }
    constructor(name:String,id:Int):this(name) //IT IS COMPULSORY TO CALL THE PRIMARY CONSTRUCTOR ,IF WE ARE
    //CALLING THE SECONDARY CONSTRUCTOR
    {
        this.id=id
        println("Within  the secondary constructor $id")
    }
}

//☝☝👀👀✨✨
