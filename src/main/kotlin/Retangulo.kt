class Retangulo(val altura: Int, val largura: Int) {

    val isQuadrado: Boolean
        get() = altura == largura

   // val isQuadrado: Boolean
        // get() {
        //    return altura == largura
        // }
}

fun main(){
    val retangulo: Retangulo = Retangulo(11,10)
    println(retangulo.isQuadrado)
}