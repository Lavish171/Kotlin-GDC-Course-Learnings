fun main()
{
var student=Student("Lavish")
}

/*class Student(name:String)  //1 way of defining the property
{
    var name="dummy"
    init {
        this.name="Suresh"
        println("The name is ${this.name}")
    }
}*/
class Student(var name:String)//defining the property within the class ie within the contructor
{
    init {
        name="Mukesh"
        println("The name is $name")
    }
}
