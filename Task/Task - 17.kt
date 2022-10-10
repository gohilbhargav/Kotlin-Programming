// faculty : id , name , contact , subject , department using of secondary constructor

class Faculty
{
    constructor(id:Int,name:String,contact:Long,subject:String,department:String)
    {
        println("Id : $id")
        println("Name : $name")
        println("Contact : $contact")
        println("Subject : $subject")
        println("Department : $department")
    }
}
fun main()
{
    var f = Faculty(12,"Rohit",9876543210,"Android","Management")
}

