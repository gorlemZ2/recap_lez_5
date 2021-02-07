import java.lang.System.Logger

import org.scalatest._
import flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import collection.JavaConverters._

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

class ExercisesTest extends AnyFlatSpec with Matchers {


  "Sums" should "sum all numbers" in {

    val x = Random.nextInt(100)
    val y = Random.nextInt(100)
    val res = if (x < y) (x to y).toList.sum else (y to x).toList.sum

    Sums.firstV(x, y) shouldBe res
    Sums.secondV(x, y) shouldBe res

  }

  "AvgEx" should "be a cool homework" in {

    val l = List(4, 5, 6, 7, 8, 9, 10)
    val res = l.sum / l.length
    val evenres = l.filter(_ % 2 == 0).sum / l.count(_ % 2 == 0)
    val oddres = l.filter(_ % 2 != 0).sum / l.count(_ % 2 != 0)


    val ls: java.util.List[Integer] = ArrayBuffer[Integer](4, 5, 6, 7, 8, 9, 10).asJava


    AvgEx.avg(ls) shouldBe res
    AvgEx.evenAvg(ls) shouldBe evenres
    AvgEx.oddAvg(ls) shouldBe oddres

  }

}
