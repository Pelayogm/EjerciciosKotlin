package almacenBebidas

class Almacen () {

    var estanteria: Array<MutableList<Bebida>> = Array(5) { MutableList(5) { Bebida(-1, 0.0, "", 0.0, "") } }

    fun agregarBebida (bebida: Bebida) {

        for (i in estanteria) {
            for (j in i.indices) {
                if (i.get(j).Id == bebida.Id) {
                    println("La bebida introducida ya existe")
                    return
                }
            }
        }

            for (i in estanteria) {
                for (j in i.indices) {
                    if (i.size <= 5) {
                        if (i[j].Id == -1) {
                            i[j] = bebida
                            println("Bebida añadida al sistema")
                            return
                        }
                    }
                }
            }
            println("No hay espacio en el almacen")

    }

    fun eliminarBebida (id:Int) {
        for (i in estanteria) {
            for (j in i.indices) {
                if (i.get(j).Id == id) {
                    i[j] = Bebida(-1, 0.0, "", 0.0, "")
                    println("Bebida eliminada")
                    return
                }
            }
        }
    }


    fun mostrarBebidas () {
        for (i in estanteria) {
            for (j in i.indices) {
                println(i[j].toString())
            }
        }
    }

    fun calcularPrecio () {
        var valorBebida = 0.0
        for (i in estanteria) {
            for (j in i.indices) {
                valorBebida += i[j].precio
            }
        }
        println("El almacen está valorado en $valorBebida")
    }

    fun calcularPrecio (marca:String) {
        try {
            var valorBebidas = 0.0
            for (i in estanteria) {
                for (j in i.indices) {
                    if (marca == i[j].marca) {
                        valorBebidas += i[j].precio
                    }
                }
            }
            println("En total de la marca $marca hay $valorBebidas en productos")
        } catch (e:Exception) {
            println("El valor introducido no es valido")
        }
    }

    fun calcularPrecio (columna:Int) {
        try {
            val bebidaLista = estanteria[columna]
            var valorBebidas = 0.0
            for (i in bebidaLista) {
                valorBebidas += i.precio
            }
            println("El valor de la columna $columna es $valorBebidas")
        } catch (e:Exception) {
            println("El valor introducido no es valido")
        }
    }


}