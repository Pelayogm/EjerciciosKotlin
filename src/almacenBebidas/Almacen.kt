package almacenBebidas

class Almacen () {

    private var columna1:MutableList<Bebida>
    private var columna2:MutableList<Bebida>
    private var columna3:MutableList<Bebida>
    private var columna4:MutableList<Bebida>
    private var columna5:MutableList<Bebida>

    var estanteria: Array<MutableList<Bebida>>

   init {
        columna1 = MutableList(5) { Bebida(-1, 0.0, "", 0.0, "") }
        columna2 = MutableList(5) { Bebida(-1, 0.0, "", 0.0, "") }
        columna3 = MutableList(5) { Bebida(-1, 0.0, "", 0.0, "") }
        columna4 = MutableList(5) { Bebida(-1, 0.0, "", 0.0, "") }
        columna5 = MutableList(5) { Bebida(-1, 0.0, "", 0.0, "") }

        estanteria = arrayOf(columna1, columna2, columna3, columna4, columna5)
    }

    fun agregarBebida (bebida: Bebida) {

        var bebidaExiste = false

        for (i in 0 until estanteria.size) {
            var bebidaLista = estanteria.get(i)
            for (j in 0 until bebidaLista.size) {
                var bebidaDeLaLista = bebidaLista[j]
                if (bebidaDeLaLista.Id == bebida.Id) {
                    bebidaExiste = true
                    println("La bebida introducida ya existe")
                    break
                }
            }
        }

        if (!bebidaExiste) {
            for (i in 0 until estanteria.size) {
                var bebidaLista = estanteria[i]
                    for (j in 0.. bebidaLista.size) {
                        var bebidaDeLaLista = bebidaLista[j]
                        if (bebidaDeLaLista.Id == -1) {
                            bebidaLista.add(j, bebida)
                            println("Bebida guardada")
                            break
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