class Pessoa (
    val name: String,
    val eye: Int
)

fun main() {
    val pessoa1: Pessoa = Pessoa("Marcelo", 38)
    val pessoa2: Pessoa = Pessoa("David", 24)

    println("Pessoa 1: ${pessoa1.name}")
    println("Pessoa 2: ${pessoa2.name}")
}