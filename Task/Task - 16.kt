// Find Prime Number using class and object

class primeNumber
{
    var number:Int = 0
    var flag : Boolean = false
    fun input()
    {
        var sc = Scanner(System.`in`)
        println("Enter number : ")
        number = sc.nextInt()
    }
    fun display()
    {
        for (i in 2..number/2)
        {
            if (number%2==0)
            {
                flag = true
                break
            }
        }
        if (!flag)
        {
            println("$number is a Prime Number")
        }
        else
        {
            println("$number is not a Prime Number")
        }

    }
}
fun main()
{
    var obj = primeNumber()
    obj.input()
    obj.display()
}
