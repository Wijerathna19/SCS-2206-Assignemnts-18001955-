object Q2 extends App
{
	class Rational(x: Int, y: Int)
    {
		private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
		var numer = x / gcd(x, y)
		var denom = y / gcd(x, y)
		
		if (denom < 0)	// to manage the sign of the rational number if the denominator is (-)
        {
			numer *= -1
			denom *= -1
		}
		
		def neg = new Rational(-this.numer, this.denom)
		
		def +(r: Rational) = new Rational(this.numer * r.denom + r.numer * this.denom, this.denom * r.denom)
		
		def -(r: Rational) = this + r.neg
		
		override def toString = numer.toString + "/" + denom.toString
	}

	val x = new Rational(3, 4)
	println("x = " + x.toString)

	val y = new Rational(5, 8)
	println("y = " + y.toString)

	val z = new Rational(2, 7)
	println("z = " + z.toString)

	val res = x-y-z
	println("x-y-z = " + res.toString)
}
