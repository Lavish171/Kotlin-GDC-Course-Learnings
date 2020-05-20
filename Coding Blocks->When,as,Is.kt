 var name="lavish"
    when(name)
    {
        "lavish"-> println("here is the lavish ,your boy")
        "rahul"->println("here is the rahul")
        "shyam"->println("here is shyam")
        "ramesh"->println("heren is ramesh")
        else ->println("bye bye")
    }

    //version 2
    var result:String=when(name)
    {
        "lavish"->"Name is lavish garg"
        "garg"->"surname is garg"
        "name"->"name is lavish garg"
        else ->"It is not a valid name"
    }
    println("The result value is ,ie returned by when is $result")
    
