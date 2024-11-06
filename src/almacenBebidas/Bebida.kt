package almacenBebidas

class Bebida {
    private val Id:Int
    private val cantidadLitros:Double
    private val marca:String
    private var precio:Double
    private val origen:String
    private val concetracionAzucar:Double
    private var descuento:Double
    private val esAgua:Boolean

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