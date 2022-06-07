package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Lineker"
    var cpf: String = "123.456.789-12"
    private set

    constructor()
    fun pessoaInfo() = "$nome  e  $cpf"
}

fun main() {
    val lineker = Pessoa()
    print(lineker.pessoaInfo())

}