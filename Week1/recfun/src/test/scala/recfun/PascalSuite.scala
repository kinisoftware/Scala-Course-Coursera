package recfun

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PascalSuite extends FunSuite {
  import Main.pascal
  test("pascal: col=0,row=2 is 1") {
    assert(pascal(0, 2) === 1)
  }

  test("pascal: col=1,row=2 is 2") {
    assert(pascal(1, 2) === 2)
  }

  test("pascal: col=1,row=3 is 3") {
    assert(pascal(1, 3) === 3)
  }

  test("pascal: col=2, row=3 is 3") {
    assert(pascal(2, 3) === 3)
  }

  test("pascal: col=3, row=7 is 35") {
    assert(pascal(3, 7) === 35)
  }
}
