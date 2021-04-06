class Vehiculo constructor(marca: String, color: String, precio: Int, velocidad: Int){
    // Tienen Propiedades
    private var marca: String = marca
    private var color: String = color
    var precio: Int = precio
    set(value) {
        field = value + 300
    }
    private var velocidad: Int = velocidad
    var precioEuro: Double = 0.0
    get() = precio * 1.17


    // Tienes Funciones o Metodos
    private fun encender(){
        println("El vehiculo se encendió.")
    }

    private fun apagar(){
        println("El vehiculo se apagó.")
    }

    private fun acelerar(){
        println("El vehiculo está acelerando.")
    }

    private fun frenar(){
        println("El vehiculo frenó.")
    }

    fun usarVehiculo(){
        println("--------------")
        println("Usar Vehiculo")
        println("--------------")
        encender()
        acelerar()
        frenar()
        apagar()
    }

    fun obtenerInformacionDelVehiculo(){
        println("--------------------------")
        println("Informacion del Vehiculo")
        println("--------------------------")
        println("Marca: ${marca}")
        println("Color: ${color}")
        println("Precio: ${precio}")
        println("Velocidad: ${velocidad}")
    }
}