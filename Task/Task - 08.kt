//  find simple interest

import java.util.Scanner

fun main()
{
    var p : Float
    var n : Float
    var r : Float

    var sc = Scanner(System.`in`)

    println("Enter Amount p : ")
    p = sc.nextFloat()

    println("Enter No of Year n : ")
    n = sc.nextFloat()

    println("Enter Rate r : ")
    r = sc.nextFloat()

    println("Simple Interest : ${(p*n*r)/100}")
}

