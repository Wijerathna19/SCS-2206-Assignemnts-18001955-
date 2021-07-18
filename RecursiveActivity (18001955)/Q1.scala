object Q1 {
  	def prime(n: Int, d: Int = 2): Boolean = {
		if (n < 2) return false;
		else if (d == n) return true;
		else if (n % d == 0) return false;
		else prime(n, d + 1);
	}
	def main(args: Array[String]){
        printf("Enter a number : ");
        var x = scala.io.StdIn.readInt();
        if (prime(x)==true) printf("true");
        if (prime(x)==false) printf("false");	
	}
}
