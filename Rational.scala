class Rational (n:Int,d:Int) {
  require(d>0, "denominator must be greater than 0")
  def numer: Int=n/gcd(Math.abs(n),d)
  def denom: Int=d/gcd(Math.abs(n),d)

  private def gcd(a:Int, b:Int):Int = if (b==0) a else gcd(b,a%b)
  def neg = new Rational(-this.numer,this.denom)
  def -(r:Rational) = new Rational(this.numer*r.denom-this.denom*r.numer, this.denom*r.denom)

  override def toString: String = numer+"/"+denom
}