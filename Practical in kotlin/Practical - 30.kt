/*
abstraction : Abstraction ia a concept which is used to we can represent only
few information not allocated background information

abstraction which can contain only abstraction method

abstract method which is contain only method declaration - not body
 */

//without abstraction
/*open class RBI()
{
    fun roi()
    {
        println("8.4")
    }
}
class SBI:RBI()
{
    fun display()
    {
        println("sbi display")
    }
}
class HDFC:RBI()
{
    fun display()
    {
        println("HDFC display")
    }
}
fun main()
{
    var sbi = SBI()
    var hdfc = HDFC()
    sbi.roi()
    sbi.display()
    hdfc.roi()
    hdfc.display()
}*/

//with abstraction

/*abstract class RBI()
{
    abstract fun roi() // method declaration
}
class SBI:RBI()
{
    fun display()
    {
        println("sbi display")
    }
    override fun roi() {
        println("6.8")
    }
}
class HDFC:RBI()
{
    fun display()
    {
        println("HDFC display")
    }
    override fun roi() {
        println("8.4")
    }
}
fun main()
{
    var sbi = SBI()
    var hdfc = HDFC()
    sbi.roi()
    sbi.display()
    hdfc.roi()
    hdfc.display()
}*/

//Vehicle with Abstraction

/*abstract class Vehicle
{
    abstract fun speed()
    abstract fun wheels()
    abstract fun color()
}
class Car:Vehicle()
{
    override fun speed() {
        println("70-90KM")
    }

    override fun wheels() {
        println("4")
    }

    override fun color() {
        println("BLUE COLOR")
    }
}
class Bike:Vehicle()
{
    override fun speed() {
        println("40-50KM")
    }

    override fun wheels() {
        println("2")
    }

    override fun color() {
        println("RED COLOR")
    }
}
fun main()
{
    var car = Car()
    var bike = Bike()
    car.color()
    car.speed()
    car.wheels()
    bike.speed()
    bike.color()
    bike.wheels()
}*/



