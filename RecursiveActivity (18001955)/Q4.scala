object Q4 {
  	def oddeven(n: Int): String = {
		  if (n == 0) return "Even";
		  if (n == 1) return "Odd";
		  else oddeven(n - 2);
	}

	def main(args: Array[String]): Unit = {
        printf("Enter a number : ");
        var x = scala.io.StdIn.readInt();
        printf("%s\n", oddeven(x));
	}
}
