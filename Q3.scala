package Demo2

object Q3 {
def main(args: Array[String]): Unit ={

  val radius:Int = 5
  Volume_of_a_sphere(radius)

}

  def Volume_of_a_sphere(r:Int): Unit ={
  print("Volume = " + ((4*math.Pi*r*r*r)/3))
  }
}
