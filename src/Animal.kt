abstract class Animal (nombre: String, edad: Int, raza: String) {
    var nombre: String = nombre
    var edad: Int = edad
    var raza: String = raza

    fun imprimirInformacion() {
        println("El nombre del animal es $nombre")
        println("La edad del animal es $edad")
    }

    abstract fun imprimirRaza()

    open fun emitirSonido(){
        println("El animal esta emitiendo un sonido")
    }

}