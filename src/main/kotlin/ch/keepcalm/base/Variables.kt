package ch.keepcalm.base

fun main() {

    var streetNumber = 10
    var streeName = "Main Street"

    val zip = "E11 P1"

    streeName = "Pudding Lane"

    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0F
    val mybinary = myHex

    val myInt = 100
    val myLongAgain: Long = myInt.toLong()

    // String
    val myChar = 'A'
    val myString = "Hallo"

    val escapeCharacters = "A new line \n"
    val rawString = "Hello " +
            "WTF"

    val rawStringNiceWay = """
        This is a string
        this is a other line 
    """

    val years = 10
    val message = "my year is $years"
    println(message)
    val message2 = "my year is ${years.toDouble()}"
    println(message2)


}