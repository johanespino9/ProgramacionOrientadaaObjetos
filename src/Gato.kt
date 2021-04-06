class Gato (nombre: String, edad: Int, raza: String): Animal(nombre, edad, raza) {

//    fun maullar(){
//        println("MIAU MIAU")
//    }

    fun trepar(){
        println("El gato esta trepando")
    }

    override fun imprimirRaza() {
        println("La raza de $nombre es: $raza")
    }

    override fun emitirSonido(){
        super.emitirSonido()
        println("Sonido del gato: MIAU MIAU")
    }
}