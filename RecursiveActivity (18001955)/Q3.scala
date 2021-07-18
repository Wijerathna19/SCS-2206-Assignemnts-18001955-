object Q3 {
    def sum(n: Int): Int = {
    	if (n == 1) return 1;
    	else return sum(n - 1) + n;
    }

    def main(args: Array[String]): Unit = {
        printf("Enter a number : ");
        var x = scala.io.StdIn.readInt();
        printf("Sum of numbers from 1 to %d = %d\n", x, sum(x));
    }
}
