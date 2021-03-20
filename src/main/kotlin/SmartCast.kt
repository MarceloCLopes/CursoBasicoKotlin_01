import java.lang.IllegalArgumentException

// (1 + 2) + 4
interface Expressao
class Numero(val valor: Int) : Expressao
class Soma(val esquerdo: Expressao, val direito: Expressao) : Expressao

// Blocos como ramificações
fun avaliacao(expressao: Expressao): Int =
    when(expressao) {
        is Numero -> {
            println("Expressão com número: ${expressao.valor}")
            expressao.valor
        }
        is Soma -> avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
        else -> throw IllegalArgumentException("Expressão é desconhecida")
    }

fun main(){
    // ((3 + 2) + 4) = 9
    val resultado = avaliacao(Soma(Soma(Numero(3), Numero(2)), Numero(4)))
    println(resultado)
}