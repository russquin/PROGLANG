
object ComputeSum {
  def compute(x: Int, y: Int): Int = {
    x + y
    // If no return statement, the last evaluation is returned
  }
}

object Main {
  def main(args: Array[String]) {
    println("1 + 2 = 3. Got: " + ComputeSum.compute(1, 2))
    println("10 + 20 = 30. Got: " + ComputeSum.compute(10, 20))
    println("5 + 15 = 20. Got: " + ComputeSum.compute(5, 15))
    println("3 + 3 = 6. Got: " + ComputeSum.compute(3, 3))
    println("26 + 0 = 26. Got: " + ComputeSum.compute(26, 0))
  }
}