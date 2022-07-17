package Demo2

object Q4 {
def main(args: Array[String]): Unit ={

  print("Total wholesale cost for 60 copies(Rs): ")
  print(total_wholesale_cost(60))

}

  def total_cover_price(n:Int):Double = {
  n * 24.95
}

  def discount_for_bookstore(amount :Double):Double = {
  amount * 0.4
  }

  def shipping_cost(n :Int):Double = {
  3*n +(n-50)*0.75

  }

  def total_wholesale_cost(n:Int):Double = {
  total_cover_price(n:Int) - discount_for_bookstore(total_cover_price(n:Int)) + shipping_cost(n:Int)
  }



}
