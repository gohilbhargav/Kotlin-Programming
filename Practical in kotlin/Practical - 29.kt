/* class : class is a collection of data member and member function
   using of object we can access properties of class

   syntax :

   class classname
   {
       block of code
   }
   // object : object is a variable

   using of object we can access all the properties
 */
 

/*class student
{
    var num1: Int = 10
    var num2: Int = 20

    fun display()
    {
        println("number 1 : $num1")
        println("number 2 : $num2")
    }
}
fun main()
{
    var obj = student()
    obj.display()
    println("num1 = ${obj.num1}")
    println("num2 = ${obj.num2}")
}*/



//check user using class and object
/*class Student
{
    var num1: Int = 0
    var num2: Int = 0

    fun input()
    {
        var sc = Scanner(System.`in`)
        println("Enter number 1 : ")
        num1 = sc.nextInt()
        println("Enter number 2 : ")
        num2 = sc.nextInt()
    }

    fun display() {
        println("num1 = $num1")
        println("num2 = $num2")
    }
}
fun main()
{
    var obj = Student()
    obj.input()
    obj.display()
}*/



/*open class student
{
    fun display()
    {
        println("Hello Display Method")
    }
}
class Faculty:student()
{
    fun displayFaculty()
    {
        println("Hello Faculty Display")
    }
}
fun main()
{
    var faculty = Faculty()
    faculty.displayFaculty()
    faculty.display()
}*/


open class A
{
    fun displayA()
    {
        println("A class")
    }
}
open class B:A()
{
    fun displayB()
    {
        println("B class")
    }
}
class C:B()
{
    fun displayC()
    {
        println("C class")
    }
}
fun main()
{
    var c = C()
    c.displayA()
    c.displayB()
    c.displayC()
}
