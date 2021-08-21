import scala.math

object Q3 extends App
{
	case class Point(a:Int, b:Int)
    {
		def x: Int = a
		def y: Int = b

		def distance = (p: Point) => math.sqrt(math.pow((this.x - p.x), 2) + math.pow((this.y - p.y), 2))
	}

    val p1 = Point(1,2)
    val p2 = Point(7,10)

    println("p1 = " + p1)
    println("p2 = " + p2)
    println("Distance between p1 and p2 = " + p1.distance(p2))
}
