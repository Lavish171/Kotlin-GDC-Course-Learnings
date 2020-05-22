fun main()
{
var account=Account()
account.deposit(160f)
account.withdraw(75f)
    account.withdraw(100f)
    account.insert("Ramesh",550f,121221144)
}
class Account
{
    var accountname:String="Lavish"
    var accountmoney:Float=0.0f
    var accountnum:Int=19
    fun insert(accountname:String,amount:Float,accountnum:Int )
    {
        this.accountname=accountname
        this.accountnum=accountnum
        this.accountmoney=amount
        println("Account name :- $accountname ,Account num $accountnum , Account money $accountmoney")
    }

    fun deposit(money:Float)
    {
        accountmoney+=money
    }
    fun withdraw(money:Float)
    {
        if(money>accountmoney) println("Not possible Transaction")
        else
        {
            accountmoney-=money
            println("Current acount money after withdrawal is $accountmoney")
        }
    }
}
