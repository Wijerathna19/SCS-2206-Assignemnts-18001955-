object Q3 extends App
{
	class Account(id: String, n: Int, b: Double)
    {
		val nic: String = id
		val acnumber: Int = n
		var balance: Double = b
		 		 
        override def toString = "["+nic+":"+acnumber +":"+ balance+"]"
        def withdraw(a: Double) = this.balance = this.balance - a
		def deposit(a: Double) = this.balance = this.balance + a
		def transfer(a: Account, b: Double) = 
        {
            this.withdraw(b)
            a.deposit(b)
        }
    }

    val acc1 = new Account("194183649136", 27869, 25000);
    val acc2 = new Account("195692736999", 36482, 50000);

    println("Accounts before the transfer")
    println("\tDetails of Account " +acc1.acnumber + " : " + acc1.toString)
    println("\tDetails of Account " +acc2.acnumber + " : " + acc2.toString)


    acc1.transfer(acc2, 5000);

    println("Account after Transfering 5000 from account " + acc1.acnumber + " to account " + acc2.acnumber);
    println("\tDetails of Account " +acc1.acnumber + " : " + acc1.toString)
    println("\tDetails of Account " +acc2.acnumber + " : " + acc2.toString)
}
