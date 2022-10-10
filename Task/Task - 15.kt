// find fibonacci using class and object
// ex : 0 1 1 2 3 5 8 13 21.......n


class fibonacci
{
    val n = 10
    var t1 = 0
    var t2 = 1
    var sum = 0

    fun display()
    {
        for (i in 1..n)
        {
            println("$t1 + ")
            sum = t1 + t2
            t1 = t2
            t2 = sum
        }
        println("Total Sum : $sum")
    }
}
fun main()
{
    var obj = fibonacci()
    obj.display()
}

