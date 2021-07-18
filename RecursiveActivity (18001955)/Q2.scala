object Q2 {
    def prime(n: Int, d: Int = 2): Boolean = {
		if (n < 2) return false;
		else if (d == n) return true;
		else if (n % d == 0) return false;
		else prime(n, d + 1);
	}
	def primeSeq(n: Int): Unit = {
		if (n <= 2) return;
		else{
			primeSeq(n - 1);
			if (prime(n)) { printf("%d\n", n); }
		}
	}
	def main(args: Array[String]): Unit = {
        printf("Enter a number : ");
        var x = scala.io.StdIn.readInt();
        printf("Prime numbers less than %d\n",x);
        primeSeq(x);
	}
}
