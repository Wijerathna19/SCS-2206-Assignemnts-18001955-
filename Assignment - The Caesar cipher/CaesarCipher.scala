object CaesarCipher extends App
{
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val shifts = 1

    val encrypt = (str1 :String) => str1.map(c => if (c != ' ') alphabet((alphabet.indexOf(c.toUpper)+ shifts) % alphabet.size) else ' ')
    val decrypt = (str2 :String) => str2.map(c => if (c != ' ') alphabet((alphabet.indexOf(c.toUpper)- shifts + alphabet.size) % alphabet.size) else ' ')

    def Cipher () :Unit =
    {
        print("\nEnter 'e' to Encrypt OR Enter 'd' to Decrypt : ")
        var i = scala.io.StdIn.readChar()
        
        if (i=='e')
        {
            print("Enter the string to be Encrypted : ")
            var str3 = scala.io.StdIn.readLine()
            println("Encrypted string : " + encrypt(str3))
        }

        if (i=='d')
        {
            print("Enter the string to be Decrypted : ")
            var str4 = scala.io.StdIn.readLine()
            println("Decrypted string : " + decrypt(str4))
        }

        print("Enter 'r' to rerun the Program OR Enter 't' to terminate the program : ")
        var j = scala.io.StdIn.readChar()

        if (j=='r') Cipher()
        if (j=='t') println("\nProgram Terminated\n")
    }

    Cipher()
}
