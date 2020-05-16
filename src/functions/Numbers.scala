package functions

object Numbers {

  def fib(number1: Int): Int = {
    if (number1 < 3) {
      1
    } else {
      fib(number1 - 1) + fib(number1 - 2)
    }
  }

  def averageInRange(listofd:List[Double]):(Double,Double)=>Double ={
    (a:Double, b: Double)=>
      val withinlowerrange:List[Double] = listofd.filter(_>a)
      val withinhigherrange:List[Double] = withinlowerrange.filter(_<b)
//      val numbAve:Double = withinhigherrange.fold(0.0)(_+_)/ withinhigherrange.length
      val average : Double = withinhigherrange.sum / withinhigherrange.length
      average
  }

  def main(args: Array[String]): Unit = {
    println(fib(1))
    println(fib(2))
    println(fib(3))
    println(fib(4))
//    println(averageInRange(List(1,2,3,4,5)))

  }
}