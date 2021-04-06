fun main() {
 var autoFerrari: Vehiculo = Vehiculo("Ferrari", "Rojo", 100000, 300)

//    autoFerrari.encender()
//    autoFerrari.acelerar()
//    autoFerrari.frenar()
//    autoFerrari.apagar()

//    autoFerrari.obtenerInformacionDelVehiculo()
    var listaDeVehiculos: MutableList<Vehiculo> = mutableListOf<Vehiculo>()
    listaDeVehiculos.add(Vehiculo("Ferrari", "Rojo", 100000, 300))
    listaDeVehiculos.add(Vehiculo("Mercedez Benz", "Negro", 30000, 200))
    listaDeVehiculos.add(Vehiculo("Audi", "Plata", 400000, 270))
    for(vehiculo in listaDeVehiculos){
//        vehiculo.obtenerInformacionDelVehiculo()
    }

   Automovil.marca = "Mercedes Benz"
   Automovil.modelo = "2021"

//   println(Automovil.marca)
//   println(Automovil.modelo)

//    val persona: Persona = Persona("Johan", "Espino", 20)
//    println("La persona se llama ${persona.nombre} ${persona.apellido} y tiene ${persona.edad} años")
//   val persona2: Persona = Persona("Juan", "Perez", 22)
//   println("La persona se llama ${persona2.nombre} ${persona2.apellido} y tiene ${persona2.edad} años")
   var vehiculo = Vehiculo("Mercedez Benz", "Negro", 30000, 200)
//   vehiculo.obtenerInformacionDelVehiculo()
//   vehiculo.usarVehiculo()
//   println("El precio del vehiculo en euros es: ${vehiculo.precioEuro}")
    vehiculo.precio = 2000
//    println(vehiculo.precio)

    var persona3 = Persona("Juan", "Perez", 20, EstadoTrabajo.Desempleado)
//    println(persona3.estadoTrabajo)

    var perro = Perro("Bobby", 3, "Labrador")
//    println("----------")
//    println("Perro")
//    println("----------")
//    perro.imprimirInformacion()
//    perro.ladrar()
//    perro.saltar()
//    perro.emitirSonido()
//    perro.imprimirRaza()

    var gato = Gato("Pelusa", 2, "Siames")
//    println("----------")
//    println("Gato")
//    println("----------")
//    gato.imprimirInformacion()
//    gato.maullar()
//    gato.trepar()
//    gato.emitirSonido()
//    gato.imprimirRaza()

    var ornitorrinco: Ornitorrinco = Ornitorrinco("Perry", "pequeño")
//    ornitorrinco.nadar()
//    ornitorrinco.amamantar()
//    ornitorrinco.ponerHuevos()

    // POLIMORFISMO
    var perro2: Perro = Perro("Bobby", 2, "Labrador")
    var gato2: Gato = Gato("Pelusa", 3, "Siames")

    fun imprimir(animal: Animal){
        println("El animal se llama ${animal.nombre}")

        if(animal is Perro) {
            var perro = animal as Perro
            perro.saltar()
        } else {
            var gato = animal as Gato
            gato.trepar()
        }
    }

    imprimir(gato2)
    imprimir(perro2)

}

enum class EstadoTrabajo {
    Desempleado,
    Empleado
}

object Automovil {
   var marca: String = "Audi"
   var modelo: String = "R8"

   fun iniciar(){
      println("El automovil es de marca $marca y modelo $modelo")
   }
}