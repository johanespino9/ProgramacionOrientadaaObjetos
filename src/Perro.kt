class Perro (nombre: String, edad: Int, raza: String) : Animal(nombre, edad, raza) {
//    fun ladrar(){
//        println("GUAU GUAU")
//    }

    fun saltar(){
        println("El perro esta saltando")
    }

    override fun imprimirRaza() {
        println("La raza del perro es: $raza")
    }


    override fun emitirSonido(){
        super.emitirSonido()
        println("Sonido del perro: GUAU GUAU")
    }
}