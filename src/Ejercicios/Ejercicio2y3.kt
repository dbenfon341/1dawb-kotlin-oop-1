package Ejercicios
import common.Persona

fun ejercicio2y3() {

    // En el main() crear 3 personas diferentes, utilizando el constructor primario y secundario,
    // y realizar lo siguiente:

    val persona1 = Persona(peso = 0.0, altura = 0.0)
    val persona2 = Persona("Victor", 65.2, 1.60, 40.20)
    val persona3 = Persona("Juan", 80.0, 1.80, 0.0)

    // Modificar su nombre y para ello debes solicitarlo al usuario por consola. No puede ser nulo o vacio.
    // Mostrar por consola sólo el nombre, peso y altura.

    print("Introduce nuevo nombre para persona1: ")
    persona1.nombre = readLine() ?: ""

    // Sobre la persona 2; a) Modificar la altura para que tenga el mismo valor que la persona 3.
    // Mostrar la persona 2 y persona 3.
    // Comparar si las dos personas son iguales, y mostrar el resultado.
    // Implementa el método equals():boolean (Pulsa Ctrl+o). e) Ejecutar la comparación.

    println("Nombre: ${persona1.nombre}, Peso: ${persona1.peso}, Altura: ${persona1.altura}")
    println("Nombre: ${persona2.nombre}, Peso: ${persona2.peso}, Altura: ${persona2.altura}")

    // Sobre la persona 3: a) Mostrar el peso, altura y imc. b)
    // Modificar la altura, por ejemplo a 1.80 c) Mostrar el peso, altura y imc.

    persona3.calcularIMC()
    println("El IMC de persona3 es ${persona3.calcularIMC().toFloat()}")
    val saludo = persona3.saludar()
    println(saludo)

}