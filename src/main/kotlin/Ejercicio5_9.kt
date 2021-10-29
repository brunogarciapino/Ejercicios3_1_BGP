class Cuenta(var numcuenta: String, var saldo: Float=0.0F) {
    fun saldodisponible():String{
        return println("Saldo disponible en la cuenta $numcuenta: $saldo€").toString()
    }
    fun realizarpago(pago:Float){
        return println("Has pagado $pago")
    }

    fun realizarabono(abono:Float){
        this.saldo= (this.saldo+abono)
        return println(saldo)
    }

    override fun toString(): String {
        return super.toString()
    }
}

class Persona(var DNI: String) {
    var cuentas: Array<Cuenta?> = arrayOfNulls(3)

    fun incorporar(c: Cuenta) {
        if (cuentas.size <3){
            cuentas += c
        } else { println("Máximo de cuentas permitidas")

            fun esMorosa():Boolean {
                for (i in 0..2){
                    if (this.cuentas[i]!!.saldo <0) return true
                }
                return false
            }

        }

        fun main() {

            var p = Persona("52798459N")
            var c1 = Cuenta("cuenta1")
            var c2 = Cuenta("Cuenta2", 700.0F)
            p.incorporar(c1)
            p.incorporar(c2)

            println("La persona con $DNI, recibe un sueldo de 1100€" )
            c1.realizarabono(1100.0F)
            println(c1.saldodisponible())
            println("La persona con $DNI, recibe un sueldo de 750€" )
            c2.realizarabono(750.0F)
            println(c2.saldodisponible())
        }