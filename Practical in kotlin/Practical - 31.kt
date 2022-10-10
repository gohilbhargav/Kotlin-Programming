import java.util.Scanner

/*
constructor : constructor is a special member

    which is invoke when an object of the class is created

    A class needs to have a constructor and if we do not declare a constructor

    then the compiler generate default constructor

    there are 2 types of constructor

    1) primary constructor
    2) secondary constructor

 */
 

/*
init block : it is acts like initlizer block where member variables are initiated
note : init block gets called before the constructor of this class is called
 */

/*class Student(a:Int , b:Int)
{
    var c = a + b
    init {
        println("value = $c")
    }
    init {
        println("this is second")
    }
}
fun main()
{
    var obj = Student(12,3)
}*/




/*
default value in primary constructor
 */

/*class Student(a:Int ,b:Int = 101)
{
    init {
        var c = a + b
        println("C = $c")
    }
}
fun main()
{
    var obj = Student(10,20)
    var obj2 = Student(5)
}*/




/*
Secondary constructor  :
constructor with specific name
syntax :
class <classname>
{
        constructor(parameter)
        {
            // block of constructor
         }
}
 */
 

/*class Student
{
    constructor(id:Int,name:String)
    {
        println("id = $id")
        println("name = $name")
    }
}
fun main() {
    var obj = Student(101, "bhargav")
}*/




/*
constructor overloading : one class can contain multiple constructor in same program

but we can use multiple constructor in same class with different-different parameters
 */

/*class Student
{
    constructor(id:Int,name:String)
    {
        println("id = $id")
        println("Name : $name")
    }
    constructor(subject:String)
    {
        println("Subject = $subject")
    }
}
fun main()
{
    var obj = Student(101,"Bhargav")
    var obj2 = Student("Android")
}*/




