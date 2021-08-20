class Account (x:Int,y:Double){
  val accNo: Int = x
  var balance: Double = y

  def transfer(that:Account, amount:Double){
    this.balance = this.balance - amount
    that.balance = that.balance + amount

    println("Account No :"+accNo+"\tnew balance :"+this.balance)
    println("Account No :"+accNo+"\tnew balance :"+that.balance)
  }

  def interest(){
    if (balance>0) balance+=balance*0.0005
    else balance-=balance*0.001
  }

  override def toString: String = "Account No :"+accNo+" Balance :"+balance
}

