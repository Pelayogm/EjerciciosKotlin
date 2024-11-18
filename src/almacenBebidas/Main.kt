package almacenBebidas

fun main () {
    val bebida1 = Bebida(1, 4.0, "Font-Vella", 6.00, "Cuenca")
    val bebida2 = Bebida(2, 4.0, "Font-Vella", 6.00, "Cuenca")
    val bebida3 = Bebida(3, 4.0, "Font-Vella", 6.00, "Cuenca")
    val bebida4 = Bebida(4, 4.0, "Font-Vella", 6.00, "Cuenca")
    val bebida5 = Bebida(5, 4.0, "Font-Vella", 6.00, "Cuenca")
    val bebida6 = Bebida(6, 4.0, "Pepsi", 4.50, 7.80, 0.0)
    val bebida7 = Bebida(7, 2.0, "Coca-Cola", 2.90, 8.90, 0.0)
    val bebida8 = Bebida(8, 14.0, "Johnnie Walker Blue Label", 600.00, "Caceres")
    val bebida9 = Bebida(9, 40.0, "Solan-de-Cabras", 16.00, "Cuenca")

    var almacen = Almacen()
    almacen.agregarBebida(bebida1)
    almacen.agregarBebida(bebida1)
    almacen.agregarBebida(bebida2)
    almacen.agregarBebida(bebida3)
    almacen.agregarBebida(bebida4)
    almacen.agregarBebida(bebida5)
    almacen.agregarBebida(bebida6)
    almacen.agregarBebida(bebida7)
    almacen.agregarBebida(bebida8)
    almacen.agregarBebida(bebida9)
    almacen.eliminarBebida(2)
    almacen.calcularPrecio(0)
    almacen.calcularPrecio("Font-Vella")
    almacen.calcularPrecio()
    almacen.mostrarBebidas()
    almacen.calcularPrecio("Coca-Cola")
    almacen.calcularPrecio("Solan-de-Cabras")

}