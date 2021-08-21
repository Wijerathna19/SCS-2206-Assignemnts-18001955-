object Q2 extends App
{
	case class Point(a:Int, b:Int)
    {
		def x: Int = a
		def y: Int = b

		def move(i:Int, j:Int) = Point(this.x+i, this.y+j)	
	}

    val p1 = Point(1,2)
    println("p1 before moving = " + p1)
    println("p1 after moving by 1 unit along both axes = " + p1.move(1,1))
}
