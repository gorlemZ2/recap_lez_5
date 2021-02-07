import org.scalatest._
import flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SimpleTest extends AnyFlatSpec with Matchers {
  "Simple" should "be easy" in {
    true
  }

}
