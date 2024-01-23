package Ejercicios
import common.Rectangulo

fun ejercicio1() {
    //Objetos utilizando la clase "Rectangulo"
    val rectangulo1 = Rectangulo(20.0, 20.0)
    val rectangulo2 = Rectangulo(10.0, 15.5)
    val rectangulo3 = Rectangulo(35.0, 33.1)

    //Mostrar por pantalla los rectángulos, sus áreas y perímetros.
    println("El rectangulo 1 tiene " + rectangulo1)
    println("El rectangulo 2 tiene " + rectangulo2)
    println("El rectangulo 3 tiene " + rectangulo3)

    /*
    /** Mostrar por pantalla los rectángulos, sus áreas y perímetros. **/
    println("El area del primer rectángulo es " + rectangulo1.areaCalc() + " y su perímetro es " + rectangulo1.perimetroCalc()
            + "El rectángulo 1 tiene una base ${rectangulo1.base} y una altura de ${rectangulo1.altura}.")
    println("El area del segundo rectángulo es " + rectangulo2.areaCalc() + " y su perímetro es " + rectangulo2.perimetroCalc()
            + "El rectángulo 2 tiene una base ${rectangulo2.base} y una altura de ${rectangulo2.altura}.")
    println("El area del tercer rectangulo es " + rectangulo3.areaCalc() + " y su perímetro es " + rectangulo3.perimetroCalc()
            + "El rectángulo 3 tiene una base ${rectangulo3.base} y una altura de ${rectangulo3.altura}."))
     */
}