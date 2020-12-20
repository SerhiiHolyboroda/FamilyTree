fun main(args: Array<String>) {
    var myGrandmaFather = Person("Тимофій", "Васильчук", 117,null  , null,null,null)
    var myGrandmaMother = Person("Оксана", "Ковалець", 126,null  , null,null,null)
    var myGrandpaFather = Person("Сергій", "Гнатюк", 142,null  , null,null,null)
    var myGrandpaMother = Person("Олена", "Леськів", 120,null  , null,null,null)

//    M - дідусь і бабуся по маминій лінії
//    F - дідусь і бабуся по татовій лінії
    var myMGrandma = Person("Ольга", "Гнатюк", 86,myGrandmaFather  , myGrandmaMother,null,null)
    var myMGrandpa = Person("Роман", "Гнатюк", 87,myGrandpaFather  , myGrandpaMother,null,null)

    var myFGrandma = Person("Єлизавета", "Леськів", 88,null  , null,null,null)
    var myFGrandpa = Person("Роман", "Леськів", 90,null  , null,null,null)

    var myMother = Person("Леся", "Леськів", 45,myMGrandma  , myMGrandpa ,null,null)
    var myFather = Person("Олег", "Леськів", 50,myFGrandma  , myFGrandpa,null,null)


    var mySelf = Person("Олег(Другий)", "Леськів", 50, myMother , myFather ,  null,null)



    println( myFather.getRelatives())
    fun getMe(): Person {
        println(mySelf.firstName)
        println(mySelf.lastName)
        return mySelf
    }
    getMe()
}