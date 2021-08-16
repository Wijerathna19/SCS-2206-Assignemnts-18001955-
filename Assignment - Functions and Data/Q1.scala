object Q1 extends App
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

    print("Enter the the numerator : ")
    var a = scala.io.StdIn.readInt()
    
    print("Enter the the denominator : ")
    var b = scala.io.StdIn.readInt()

    val x = new Rational(a, b)
    val y = x.neg
    println("Negative of the entered rational number = " + y.toString())
}
