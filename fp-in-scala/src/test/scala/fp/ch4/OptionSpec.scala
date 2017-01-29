package fp.ch4

import org.scalatest.FunSpec

class OptionSpec extends FunSpec {

  describe("map") {
    it("maps") {
      val aNum = Some(3)
      def f(n: Int): String = "x" * n
      assert(aNum.map(f) === Some("xxx"))
      assert(None.map(f) === None)
    }
  }

}
