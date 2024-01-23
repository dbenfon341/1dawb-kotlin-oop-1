package common
import kotlin.math.roundToInt

class Persona(var peso: Double, var altura: Double) {
    var nombre: String = ""

    var imc: Double = 0.0

    // Crear un constructor secundario que también incluya el nombre de la persona cómo parámetro.
    constructor(nombre: String, peso: Double, altura: Double, imc: Double) : this(peso, altura) {
        this.nombre = nombre
        this.imc = imc
    }

    // Creamos la función calcularIMC que retorna el IMC de la persona.
    fun calcularIMC(): Double {
        return (this.peso / (this.altura * this.altura) * 100.0).roundToInt() / 100.0
    }

    // Debe retornar un saludo con su nombre... saludar():String
    fun saludar(): String {
        return "${this.nombre} te saluda."
    }

    // Debe retornar si altura por encima de la media (solo si altura >= 1.75)... alturaEncimaMedia():Boolean

    // Debe retornar si peso por encima de la media (solo si peso >= 70)... pesoEncimaMedia():Boolean

    // Sería conveniente añadir también un método obtenerDescImc() para usar en obtenerDesc(), que implemente el
    // retorno de la descripción del rango de tipo de imc al que equivale su cálculo.
}