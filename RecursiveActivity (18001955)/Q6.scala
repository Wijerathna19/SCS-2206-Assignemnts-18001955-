object Q6 {
  	def getNum(n: Int): Int = {
		if (n == 1) return 0;
		else if (n == 2) return 1;
		else return getNum(n - 1) + getNum(n - 2);
	}
	def fibonacci(n: Int): Unit = {
		if (n == 0) return;
		else{
			fibonacci(n - 1);
			printf("%d\n", getNum(n));
		}
	}
	def main(args: Array[String]): Unit = {
        printf("Enter a number : ");
        var x = scala.io.StdIn.readInt();
		printf("Fibonacci sequence through to %d;\n", x);
		fibonacci(x);
	}
}
