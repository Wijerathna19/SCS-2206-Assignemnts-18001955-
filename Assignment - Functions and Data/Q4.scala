object Q4 extends App
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

        def getNIC = this.nic
		def getAcnumber = this.acnumber
		def getBalance = this.balance
    }

    var bank :List[Account] = List(
        new Account("194183649136", 63638, -1000),
        new Account("194927984393", 37763, -2000),
        new Account("192746836897", 69374, 3000),
        new Account("193437367367", 79946, 4000)
    )

    val overdraft = (b: List[Account]) => b.filter(x => x.getBalance < 0)
    val balanceSum = (b: List[Account]) => b.reduce((x, y) => new Account("", 0, x.getBalance + y.getBalance))
    val interest = (b: List[Account]) => b.map(x => if (x.getBalance < 0) new Account(x.getNIC, x.getAcnumber, (x.getBalance * 1.1)) else new Account(x.getNIC, x.getAcnumber, (x.getBalance * 1.05)))
    
    println("Accounts in the bank\n\t" + bank.mkString("\n\t"))
    println("4.1 Results of overdraft function\n\t" + overdraft(bank).mkString("\n\t"))
    println("4.2 Results of balanceSum function\n\tTotal balance : " + balanceSum(bank).balance)
    println("4.3 Results of interest function\n\t" + interest(bank).mkString("\n\t"))
}
