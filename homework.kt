fun main() {
    val p1 = Point(3F, 4F)

    val p2 = Point(3F, 4F)
    println(p1 == p2)
    print(p1)

}

class Point(x: Float, y: Float) {
    private var abscissus: Float = x
    private var ordinatus: Float = y

    override fun toString(): String {
        return "$abscissus, $ordinatus"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (abscissus == other.abscissus && ordinatus == other.ordinatus) {
                return true
            }
        }
        return false
    }


}

fun oppositeOfY(){
    this.ordinatus = -1 * this.ordinatus
}

}



fun main() {
    val f1 = Fraction(3F, 4F)

    val f2 = Fraction(3F, 4F)
    println(f1 == f2)

    println(f1)

}


class Fraction(n: Float, d: Float) {
    private var numerator: Float = n
    private var denominator: Float = d

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator) {
                return true
            }
        }
        return false
    }

    fun simplify(n: Float) {
        numerator = numerator / n
        denominator = denominator / n

    }

    fun addFractions(other: Fraction): String {
        numerator = numerator * other.denominator
        other.numerator = other.numerator * denominator

        denominator = denominator * other.denominator
        other.denominator = denominator

        return "($numerator + ${other.numerator}) / $denominator"

    }

    fun multiplication(other: Fraction): String {
        numerator = numerator * other.numerator
        denominator = denominator * other.denominator

        return "$numerator / $denominator"
    }
}


