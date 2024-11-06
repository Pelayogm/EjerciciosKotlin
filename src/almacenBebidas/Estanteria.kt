package almacenBebidas

class Estanteria {
    val columna1:List<MutableList<Bebida>> = mutableListOf()
    val columna2:List<MutableList<Bebida>> = mutableListOf()
    val columna3:List<MutableList<Bebida>> = mutableListOf()
    val columna4:List<MutableList<Bebida>> = mutableListOf()
    val columna5:List<MutableList<Bebida>> = mutableListOf()

    constructor() {
        val estanteria = arrayOf(columna1, columna2, columna3, columna4, columna5)
    }
}