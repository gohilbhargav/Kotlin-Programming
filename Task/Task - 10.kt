// accept days and convert it into years and months

import java.util.Scanner

fun main()
{
    var sc = Scanner(System.`in`)
    var days : Int
    var months : Int
    var years : Int

    println("Enter Days : ")
    days = sc.nextInt()

    months = days / 30
    years = days / 365

    println("Months : $months  And  Years : $years")
}

