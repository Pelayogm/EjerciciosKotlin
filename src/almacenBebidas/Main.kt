package almacenBebidas

fun main () {
    val bebida1 = Bebida(1, 4.0, "Font-Vella", 6.00, "Cuenca")

    var almacen = Almacen()
    almacen.agregarBebida(bebida1)
    almacen.agregarBebida(bebida1)
    almacen.agregarBebida(bebida1)
    almacen.eliminarBebida(2)
    almacen.eliminarBebida(2)

}