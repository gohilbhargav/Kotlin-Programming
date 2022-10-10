// accept years and convert it into no. of months and days

import java.util.Scanner

fun main()
{
    var sc = Scanner(System.`in`)
    var years : Int
    var months : Int
    var days : Int

    println("Enter Years : ")
    years = sc.nextInt()

    months = years * 12
    days = years * 365
    println("Months : $months  And  Days : $days")
}

