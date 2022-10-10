//  accept months from user and convert it into number of years

import java.util.Scanner

fun main()
{
    var sc = Scanner(System.`in`)
    var months : Int
    var years : Int
    println("Enter Moths : ")
    months = sc.nextInt()

    println("Year : ${months/12}")
}
