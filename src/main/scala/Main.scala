import br.unb.cic.epl._

object Main extends App {
  //println("Hello, World!")

  val eval = new Eval()

  //EXAMPLE SUM
  var literal100: Literal = _
  var literal200: Literal = _
  literal100 = new Literal(100)
  literal200 = new Literal(200)
  val add = new Add(literal100, literal200)
  add.accept(eval)
  print(add.print() + " = ");
  println(eval.result())


  // #### EXAMPLE SUB ####
  var literal400: Literal = _
  var literal300: Literal = _
  literal400 = new Literal(400)
  literal300 = new Literal(300)
  val sub = new Sub(literal400, literal300)
  sub.accept(eval)
  print(sub.print() + " = ");
  println(eval.result())

  // #### EXAMPLE MULT ####
  var literal500: Literal = _
  var literal600: Literal = _
  literal500 = new Literal(500)
  literal600 = new Literal(600)
  val mult = new Mult(literal500, literal600)
  mult.accept(eval)
  print(mult.print() + " = ");
  println(eval.result())


  // ### EXAMPLE COMPOST ###
  val eval2 = new Eval()
  var literal1 = new Literal(1)
  var literal2 = new Literal(2)
  var literal3 = new Literal(3)

  val add2 = new Add(literal1, literal2)
  val add3 = new Add(literal3, add2)
  add2.accept(eval2)
  add3.accept(eval2)
  print(add3.print())


}