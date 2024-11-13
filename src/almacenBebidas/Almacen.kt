package almacenBebidas

class Almacen () {

    private lateinit var columna1:MutableList<Bebida?>
    private lateinit var columna2:MutableList<Bebida?>
    private lateinit var columna3:MutableList<Bebida?>
    private lateinit var columna4:MutableList<Bebida?>
    private lateinit var columna5:MutableList<Bebida?>

    val estanteria = arrayOf(columna1, columna2, columna3, columna4, columna5)

    fun constructor() {
        columna1 = MutableList(5) {null}
        columna2 = MutableList(5) {null}
        columna3 = MutableList(5) {null}
    }


    fun agregarBebida (bebida: Bebida) {

        var bebidaExiste = false

        for (i in 0.. estanteria.size) {
            var bebidaLista = estanteria.get(i)
            for (j in 0.. bebidaLista.size) {

            }
        }

        if (!bebidaExiste) {
            for (i in 0.. estanteria.size) {
                var bebidaLista = estanteria.get(i)
                if (bebidaLista.size <= 5) {
                    for (j in 0.. bebidaLista.size) {
                        bebidaLista.add(bebida)
                        println("Bebida guardada")
                    }
                }
            }
        }


    }

    fun eliminarBebida (id:Int) {

    }


    fun mostrarBebidas () {

    }


}