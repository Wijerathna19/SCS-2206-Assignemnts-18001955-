object Q4 extends App
{
	case class Point(a:Int, b:Int)
    {
		def x: Int = a
		def y: Int = b

		def invert = Point(this.y, this.x)
	}

    val p = Point(1,2)

    println("p = " + p)
    println("p (inverted) = " + p.invert)
}
