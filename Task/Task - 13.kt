import java.util.Scanner

fun main()
{
    var sc = Scanner(System.`in`)
    var num : Int

    println("Enter Number : ")
    num = sc.nextInt()

    if (num%2==0)
    {
        println("Even Number")
    }
    else
    {
        println("Odd Number")
    }
}
