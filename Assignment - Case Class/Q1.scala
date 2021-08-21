object Q1 extends App
{
	case class Point(a:Int, b:Int)
    {
		def x: Int = a
		def y: Int = b

		def +(p: Point) = Point(this.x + p.x, this.y + p.y)		
	}

    val p1 = Point(1,2)
    val p2 = Point(3,4)

    println("p1 = " + p1)
    println("p2 = " + p2)
    println("p1 + p2 = " + (p1+p2))
}
