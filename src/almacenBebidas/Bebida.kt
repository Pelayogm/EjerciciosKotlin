package almacenBebidas

class Bebida {
    val Id:Int
    val cantidadLitros:Double
    val marca:String
    var precio:Double
    val origen:String
    val concetracionAzucar:Double
    var descuento:Double
    val esAgua:Boolean

    constructor(id:Int, cantidad:Double, marca:String, precio:Double, origen:String) {
        this.Id = id
        this.cantidadLitros = cantidad
        this.marca = marca
        this.precio = precio
        this.origen = origen
        concetracionAzucar = 0.0
        descuento = 0.0
        esAgua = true
    }

    constructor(id: Int, cantidad: Double, marca: String, precio: Double, azucar:Double, descuento:Double) {
        this.Id = id
        this.cantidadLitros = cantidad
        this.marca = marca
        this.precio = precio
        this.concetracionAzucar = azucar
        this.descuento = descuento
        this.origen = marca
        esAgua = false
    }

}