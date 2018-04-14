package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter

class TestHeight extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {


  it should "result in eval height in compost operator with literal should be equals 3" in {
    val eval4 = new Eval()

    var literal1 = new Literal(1)
    var literal2 = new Literal(2)
    var literal3 = new Literal(3)

    val add2 = new Add(literal1, literal2)
    val add3 = new Add(literal3, add2)
    add2.accept(eval4)
    add3.accept(eval4)

    eval4.result() should be (3)

  }



}
