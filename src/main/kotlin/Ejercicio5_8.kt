class Tiempo(var hora: Int, var minuto: Int, var segundo: Int) {
    init {
        require(hora >= 0 && minuto >= 0 && segundo >= 0) { "Has introducido valores permitidos" }
        while (segundo >= 60) {
            segundo -= 60
            minuto += 1
        }
        while (minuto >= 60) {
            minuto -= 60
            hora += 1
        }


    }
    override fun toString(): String {
        return "${this.hora} h ${this.minuto} m ${this.segundo}s "
    }
}


fun main() {
    var hora:Int
    var minuto:Int
    var segundo:Int

    println("Introduce la hora")
    hora = readLine()?.toInt() ?: 0
    println("Introduce los minutos")
    minuto = readLine()?.toInt() ?: 0
    println("Introduce los segundos")
    segundo = readLine()?.toInt() ?: 0
    println("El tiempo es: h:$hora,m:$minuto,s:$segundo")

}
fun nulos(){
    var hora:Int
    var minuto:Int
    var segundo:Int
    if hora && minuto && segundo
}