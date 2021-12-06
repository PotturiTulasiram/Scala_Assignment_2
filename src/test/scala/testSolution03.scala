import org.scalatest.funsuite.AnyFunSuite

class testSolution03 extends AnyFunSuite {
  test("Solution03"){
    assert(Solution03.countLen(List(1,2,3,4,5,6,7,8,9,10)) === 10)
    assert((Solution03.countLen(List(2,4,6,8,10,12))) === 6)
    assert(Solution03.countLen(List(1,3,5,7,9)) === 5)
  }
}
