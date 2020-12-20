class Person(
    var firstName: String,
    var lastName: String,
    val age: Int,
    val Mother: Person?,
    val Father: Person?,
    var Sisters: ArrayList<Person>?,
    var Brothers: ArrayList<Person>?
){
//    var noOfRelatives = 0
//    fun counter(): Int {
//        return noOfRelatives
//    }
//    init {
//        noOfRelatives++
//    }

    companion object {
        var noOfRelatives: Int = 0

        fun counter(): Int {
            return noOfRelatives
        }
    }

    init {
        noOfRelatives++
    }
    fun getRelatives(){
        println(noOfRelatives)
    }

}

