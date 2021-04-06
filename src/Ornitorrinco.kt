class Ornitorrinco (nombre: String, tamano: String) : Mamifero, Oviparo {
    var nombre: String = nombre
    var tamano: String = tamano

    override fun amamantar() {
        println("Esta amamantando")
    }

    override fun ponerHuevos() {
        println("Poniendo huevos")
    }

    fun nadar(){
        println("Esta nadando")
    }

}