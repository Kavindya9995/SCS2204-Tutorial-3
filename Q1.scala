package Demo2

object Q1 {
def main(args: Array[String]):Unit={

  val radius:Int = 5
  Area_of_a_disk(radius)
}

  def Area_of_a_disk(r:Int): Unit ={
  print("Area: " + math.Pi*r*r)
  }
}
