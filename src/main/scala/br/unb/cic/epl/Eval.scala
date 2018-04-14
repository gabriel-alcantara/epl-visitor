package br.unb.cic.epl

class Eval extends Visitor{
  var res : Int = 0
  var hei : Int = 0
  override def visit(exp: Literal) { res = exp.value } 

  // ### SUM ###
  override def visit(exp: Add) {
    exp.lhs.accept(this)
    val vl = res
    exp.rhs.accept(this)
    val vr = res
    res = vl + vr
    hei+=1;
  }

  // ### SUB ###
  override def visit(exp: Sub) {
    exp.lhs.accept(this)
    val vl = res
    exp.rhs.accept(this)
    val vr = res
    res = vl - vr
    hei+=1;
  }

  // ### MULT ###
  override def visit(exp: Mult) {
    exp.lhs.accept(this)
    val vl = res
    exp.rhs.accept(this)
    val vr = res
    res = vl * vr
    hei+=1;
  }


  def result() : Int = res
  def height() : Int = {
    if(hei<2){
      return hei+1
    } else {
      return hei
    }
  }

}
