object Q5 {
  	def even(n: Int, i: Int): Int = { 
		  if (i < 0) return 0;
		  else if (i == 0) return n;
		  else if (i == 1) return 0;
		  else even(n, i - 2);
	}
	def sum(n: Int): Int = {
		if (n == 1) return 0;
		else return sum(n - 1) + even(n, n);
	}

	def main(args: Array[String]): Unit = {
        printf("Enter a number : ");
        var x = scala.io.StdIn.readInt();
		printf("Addition of even numbers less than %d = %d\n", x, sum(x));
	}
}
