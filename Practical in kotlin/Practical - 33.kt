import java.lang.Exception

//Exception Handling

/*
exception handling :

it is distrurb the normal flow of the program

using of try and catch block we can resolve exception or we can say that exception handling

syntax :

try
{
   statement
}
except
{
   statement
}
 */

fun main()
{
    try {
        var num1:Int = 12
        var num2:Int = 0

        println(num1/num2)
    }
    catch (e: Exception)
    {
        println("this is exception : ")
    }
}

