package br.unb.cic.epl

class Eval extends Visitor{
  var res : Int = 0 
  override def visit(exp: Literal) { res = exp.value } 

  // ### SUM ###
  override def visit(exp: Add) {
    exp.lhs.accept(this)
    val vl = res
    exp.rhs.accept(this)
    val vr = res
    res = vl + vr
  }

  // ### SUB ###
  override def visit(exp: Sub) {
    exp.lhs.accept(this)
    val vl = res
    exp.rhs.accept(this)
    val vr = res
    res = vl - vr
  }

  // ### MULT ###
  override def visit(exp: Mult) {
    exp.lhs.accept(this)
    val vl = res
    exp.rhs.accept(this)
    val vr = res
    res = vl * vr
  }


  def result() : Int = res

}
