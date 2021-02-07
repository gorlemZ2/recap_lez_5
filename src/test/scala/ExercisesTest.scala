import java.lang.System.Logger

import org.scalatest._
import flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import scala.util.Random

class ExercisesTest extends AnyFlatSpec with Matchers {


  "Sums" should "sum all numbers" in {

    val x = Random.nextInt(100)
    val y = Random.nextInt(100)
    val res = if(x<y) (x to y).toList.sum  else (y to x).toList.sum

    Sums.firstV(x, y) shouldBe res
    Sums.secondV(x, y) shouldBe res

  }

}
