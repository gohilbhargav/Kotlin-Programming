                              Task-2 : Bank Interest
   
   
fun main()
{
   bankintrest(5000,'Q')
}
fun bankintrest(num : Int , time : Char)
{
    if (time == 'A')
    {
        println("Annual Interest is $num ")
    }
    else if (time == 'H')
    {
        println("Six Month Interest is ${num/2}")
    }
    else if (time == 'Q')
    {
        println("Four Month Interest is ${num/3}")
    }
}   
   
   
        
