import kotlin.math.sqrt
import kotlin.math.pow


fun main() {
    val point1 = Point(2.0, 7.0)
    val point2 = Point(3.0, 6.0)
    val point3 = Point(4.0, 5.0)
    val point4 = Point(5.0, 6.0)
    println(point1.distance(point2))
    println(point1.symmetry())
    println(point1 == point2)
    println(point2.symmetry())
}

class Point(x: Double, y: Double) {
    private var CoordinateX = x
    private var CoordinateY = y
    override fun toString(): String {
        return "X:$CoordinateX, Y:$CoordinateY"
    }

    override fun equals(other: Any?): Boolean {
        return other is Point && other.CoordinateY == CoordinateX && other.CoordinateY == CoordinateY

    }

    fun symmetry(): Point {
        return Point(CoordinateX * -1, CoordinateY * -1)
    }

    fun distance(point: Point): Double {

        return sqrt((point.CoordinateX - CoordinateX).pow(2.0) + (point.CoordinateY - CoordinateY).pow(2.0))
    }
}

