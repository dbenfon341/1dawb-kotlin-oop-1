package common

/** Clase rectángulo con atributo base y altura. **/
class Rectangulo(val base: Double, val altura: Double) {

    /** Init para establecer que base y altura deben ser mayor que 0 **/
    init {
        require(this.base > 0 && this.altura > 0) { "La base y altura debe ser mayor que 0." }
    }

    /**
     * Metodo para calcular el area del rectángulo con los atributos base y altura.
     * @return Devuelve el area.
     */
    private fun areaCalc(): Double {
        return this.base * this.altura
    }

    /**
     * Metodo para calcular el perímetro del rectángulo con los atributos base y altura.
     * @return Devuelve el perímetro.
     */
    private fun perimetroCalc(): Double {
        return 2 * this.base + 2 * this.altura
    }

    /**
     * Método toString() para mostrar información sobre el rectángulo.
     * @return Devuelve un print con la información del rectángulo, includo su area y su perímetro.
     */
    override fun toString(): String {
        return "una base de $base, una altura de $altura, un area de ${areaCalc()} y perimetro de ${perimetroCalc()}."
    }

}
