fun main() {
    val frac1 = Fraction(2,6)
    val frac2 = Fraction(4,8)
    println(frac1.multiply(frac2))
    println(frac1.divide(frac2))
    println(frac1.plus(frac2))
    println(frac1.minus(frac2))
    println(truncate(frac1))
}

class Fraction(mricxveli: Int, mnishvneli:Int){
    var a = mricxveli
    var b = mnishvneli
    override fun toString(): String {
        return "$a / $b"
    }

    override fun equals(other: Any?): Boolean {
        return other is Fraction && other.a * other.b == other.b * a
    }
    fun multiply(f:Fraction):Fraction{
        val num = (f.a*a)
        val dec = (f.b*b)
        return (Fraction(num,dec))

    }

    fun divide(f:Fraction):Fraction{
        val num = a*f.b
        val dec = b*f.a
        return (Fraction(num,dec))
    }
    fun plus(fraction: Fraction):Fraction{
        val numn = a*fraction.b+fraction.a*b
        val decn = b *fraction.b
        return (Fraction(numn,decn))
    }
    fun minus(fraction: Fraction):Fraction{
        val numn = a*fraction.b - fraction.a*b
        val decn = b *fraction.b
        return (Fraction(numn,decn))
    }
}
fun truncate(fraction: Fraction):Fraction{
    val z = gamyofi(fraction.a,fraction.b)
    return Fraction(fraction.a/z,fraction.b/z)
}
fun gamyofi(num1:Int,num2:Int):Int{
    return if (num2 ==0){
        num1
    }
    else{
        gamyofi(num2,num1%num2)
    }

}
