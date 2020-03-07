package ch.keepcalm.base.tidbits

import ch.keepcalm.base.classes.CustomerKotlin


fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 230000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("Madrid", "Europe", 230000)
}

fun main() {
    val result = capitalAndPopulation("Madrid")
    println(result.first)
    println(result.second)


    println("##########################")
    val countryInfo = countryInformation("Madrid")
    println(countryInfo.first)
    println(countryInfo.second)
    println(countryInfo.third)


    //deconstruct values
    println("##########################")
    val (capital, population) = capitalAndPopulation("Madrid")
    println(capital)
    println(population)


    println("##########################")
    val (cap, cont,  pop) = countryInformation("Madrid")
    println(cap)
    println(cont)
    println(pop)

    //deconstruct values
    println("##########################")
    val (id, name, email) = CustomerKotlin(id = 1, name = "Foo", email = "mail")
    println(email)

    println("##########################")
    val listCapitalAndCountries = listOf(Pair("Madrid", "Spain"), "Paris" to "France")
    for ((capital1, country1) in listCapitalAndCountries){
        println("$capital1 - $country1")
    }

}