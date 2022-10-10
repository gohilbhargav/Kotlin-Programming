// Conditional statements

/*fun main()
{
    var sc = Scanner(System.`in`)
    var num : Int

    println("Enter Number : ")
    num = sc.nextInt()

    if(num>100)
    {
        println("Number is above 100")
    }
    else
    {
        println("Number is below 100")
    }
}*/



//  else if statement
/*import java.util.Scanner

fun main()
{
    var sc = Scanner(System.`in`)
    var marks : Int

    println("Enter Number : ")
    marks = sc.nextInt()

    if (marks>=70 && marks<=100)
    {
        println("A grade")
    }
    else if (marks>=60 && marks<70)
    {
        println("B grade")
    }
    else if (marks>=50 && marks<60)
    {
        println("C grade")
    }
    else if (marks>=40 && marks<50)
    {
        println("D grade")
    }
    else
    {
        println("Fail")
    }
}*/



// nested if statement

fun main()
{
    var num1 : Int
    var num2 : Int
    var num3 : Int

    var sc = Scanner(System.`in`)

    println("Enter Number 1 : ")
    num1 = sc.nextInt()

    println("Enter Number 2 : ")
    num2 = sc.nextInt()

    println("Enter Number 3 : ")
    num3 = sc.nextInt()

    if (num1>num2)
    {
        if (num1>num3)
        {
            println("number 1 is greater")
        }
        else
        {
            println("number 3 is greater")
        }
    }
    else
    {
        if (num2>num3)
        {
            println("number 2 is greater")
        }
        else
        {
            println("number 3 is greater")
        }
    }
}
