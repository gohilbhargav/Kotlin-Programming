//  find area of circle

import java.util.Scanner

fun main()
{
    var sc = Scanner(System.`in`)
    var radius : Float

    println("Enter Radius : ")
    radius = sc.nextFloat()

    // pi = 3.142
    //Area of circle = pi * r * r
    println("Area Of Circle : ${3.142 * radius * radius}")
}


