package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Lineker"
    var cpf: String = "123.456.789-12"
    private set
}

fun main(){
    val lineker = Pessoa()
    println(lineker.nome)
    println(lineker.cpf)
}