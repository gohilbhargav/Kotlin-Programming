//Do While

/*fun main() {
    var i = 1;
    do {
        println(i);
        i++;
    } while (i <= 5)
}*/



//jumpping Statament
//break and continue

fun main()
{
    var i = 1
    for (i in 1..5)
    {
        println(i)
        if (i==3)
        {
            println("break the loop")
            break;
           // continue;
        }
    }
}

