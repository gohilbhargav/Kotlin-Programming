// find factorial using class and object
// factorial(!) ex : 5 = 5*4*3*2*1


class factorial
{
    var number:Int = 0
    var fact: Long = 1
    fun input()
    {
        var sc = Scanner(System.`in`)
        println("Enter number : ")
        number = sc.nextInt()
    }
    fun display()
    {
        for (i in 1..number)
        {
            fact = fact * i.toLong()
        }
        println("Factorial : $number = $fact")
    }
}
fun main()
{
    var obj = factorial()
    obj.input()
    obj.display()
}
