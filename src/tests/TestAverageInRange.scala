package tests
import functions._
import org.scalatest.FunSuite

class TestAverageInRange extends FunSuite{
  test("see if we can find average"){
      assert(Numbers.averageInRange(List(3,5,7,11,3,5,21))(1,7)==4.0)
    assert(Numbers.averageInRange(List(3,5,7,11,3,5,21,67))(1,70)==15.25)
    assert(Numbers.averageInRange(List(3,5,7,11,3,5,21))(5,21)==9.0)

  }

}
