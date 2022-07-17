package Demo2

object Q5 {
  def main(args: Array[String]): Unit = {

    print("The total running time(min): ")

    print(easyPhase_running_time(2) + tempoPhase_running_time(3) + easyPhase_running_time(2))
  }


  def easyPhase_running_time(d1: Int): Double = {
  d1 * 8

  }

  def tempoPhase_running_time(d2: Int): Double = {
  d2 * 7
  }

}

