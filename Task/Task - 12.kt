fun main()
{
    menu()
}
fun menu()
{
    var menuDetails = """
                MENU
                 
                 press 1 for addition
                 press 2 for substraction
                 press 3 for multiplication
                 press 4 for division           
    """

    println(menuDetails)
    var choice : Int
    var sc = Scanner(System.`in`)
    println("Enter Your Choice : ")
    choice = sc.nextInt()

    when(choice)
    {
        1 -> addition()
        2 -> substraction()
        3 -> multiplpliction()
        4 -> division()
        else -> println("Invalid Choice")
    }
}
fun addition()
{
    var num1: Int
    var num2 : Int

    var sc = Scanner(System.`in`)
    println("Enter Number 1 : ")
    num1 = sc.nextInt()

    println("Enter Number 2 : ")
    num2 = sc.nextInt()

    var ans = num1 + num2
    println("Ans : $ans")
}

fun substraction()
{
    var num1: Int
    var num2 : Int

    var sc = Scanner(System.`in`)
    println("Enter Number 1 : ")
    num1 = sc.nextInt()

    println("Enter Number 2 : ")
    num2 = sc.nextInt()

    var ans = num1 - num2
    println("Ans : $ans")
}

fun multiplpliction()
{
    var num1: Int
    var num2 : Int

    var sc = Scanner(System.`in`)
    println("Enter Number 1 : ")
    num1 = sc.nextInt()

    println("Enter Number 2 : ")
    num2 = sc.nextInt()

    var ans = num1 * num2
    println("Ans : $ans")
}

fun division()
{
    var num1: Int
    var num2 : Int

    var sc = Scanner(System.`in`)
    println("Enter Number 1 : ")
    num1 = sc.nextInt()

    println("Enter Number 2 : ")
    num2 = sc.nextInt()

    var ans = num1 / num2
    println("Ans : $ans")

