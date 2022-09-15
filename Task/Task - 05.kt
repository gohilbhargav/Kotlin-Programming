                       Task - 5 : Bank Try


fun main()
{
    var bankTry= arrayOf(1,2,3)
    var atpin = 3028
    for (item in bankTry)
    {
        println("Enter Our Bank Pin : ")
        var btry = readLine()!!.toInt()
        if (btry == atpin)
        {
            println("Welcome to bank process")
            break
        }
        if (item == 2)
        {
            println("Be Careful This is ur last attempt")
        }
    }
}    
