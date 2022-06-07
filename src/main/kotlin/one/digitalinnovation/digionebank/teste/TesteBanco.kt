package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digioneBanck = Banco(nome = "DigioOne", numero =12)

    println(digioneBanck.nome)
    println(digioneBanck.numero)
}