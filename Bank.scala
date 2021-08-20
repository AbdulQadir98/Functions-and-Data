object Bank extends App{
  val acc1 = new Account(2019102,10000)
  val acc2 = new Account(2019103,8000)
  val acc3 = new Account(2019104,-1000)
  val acc4 = new Account(2019105,-3000)

  val accList:List[Account] = List(acc1,acc2,acc3,acc4)

  //Example : acc1 transferring 500 to acc2
  println("\nAccount details before tranferring :")
  println(acc1)
  println(acc2)
  println("\nAccount details after tranferring :")
  acc1.transfer(acc2,500)

  //Creating List of Accounts with negative balances
  val negBalance = (acc:List[Account] ) => acc.filter( acc => acc.balance < 0)
  println("\nList of Accounts with negative balances")
  println(negBalance(accList))

  //Calculating the sum of all account balances
  val accBalance = accList.map(_.balance)
  val sum=accBalance.reduce((a,b)=>a+b)
  println("\nSum of all account balances : "+sum)

  //Calculating the final balances after interest
  val finalList = accList.map(_.interest())
  val finalBalance = accList.map(_.balance)
  val finalTotal=finalBalance.reduce((a,b)=>a+b)
  println("\nfinal balance of all accounts : "+finalTotal)
}
