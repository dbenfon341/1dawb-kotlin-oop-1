import Ejercicios.*

fun main() {
    while (true) {
        println("Selecciona un ejercicio:")
        println("1. Ejercicio 1")
        println("2. Ejercicio 2 y 3")
        println("3. Ejercicio 4")
        println("4. Ejercicio 5")
        println("0. Salir")

        val opcion = readLine()?.toIntOrNull()

        when (opcion) {
            1 -> {
                ejercicio1()
            }
            2 -> {
                ejercicio2y3()
            }
            3 -> {
                ejercicio4()
            }
            4 -> {
                ejercicio5()
            }
            0 -> {
                println("Saliendo del programa.")
                return
            }
            else -> {
                println("Opción no válida. Inténtalo de nuevo.")
            }
        }
    }
}