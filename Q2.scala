package Demo2

object Q2 {
  def main(args: Array[String]):Unit={

    val Celsius: Int = 35

    print("Temperature in fahrenheit = ")
    celsiusToFahrenheit(Celsius)

  }

  def celsiusToFahrenheit(C:Double) :Unit={
    print((1.8000 * C) + 32)
  }
}
