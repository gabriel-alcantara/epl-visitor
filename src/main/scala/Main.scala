import br.unb.cic.epl._

object Main extends App {
  //println("Hello, World!")


  // ### EXAMPLE SUM ###
  println("### EXAMPLE ADD ###")
  val eval1 = new Eval()

  var literal100: Literal = _
  var literal200: Literal = _
  literal100 = new Literal(100)
  literal200 = new Literal(200)
  val add = new Add(literal100, literal200)
  add.accept(eval1)
  print(add.print() + " = ");
  println(eval1.result())
  println("Height: " + eval1.height())



  // #### EXAMPLE SUB ####
  println("### EXAMPLE SUB ###")
  val eval2 = new Eval()

  var literal400: Literal = _
  var literal300: Literal = _
  literal400 = new Literal(400)
  literal300 = new Literal(300)
  val sub = new Sub(literal400, literal300)
  sub.accept(eval2)
  print(sub.print() + " = ");
  println(eval2.result())
  println("Height: " + eval2.height())


  // #### EXAMPLE MULT ####
  println("### EXAMPLE MULT ###")
  val eval3 = new Eval()

  var literal500: Literal = _
  var literal600: Literal = _
  literal500 = new Literal(500)
  literal600 = new Literal(600)
  val mult = new Mult(literal500, literal600)
  mult.accept(eval3)
  print(mult.print() + " = ");
  println(eval3.result())
  println("Height: " + eval3.height())



  // ### EXAMPLE COMPOST ###
  println("### EXAMPLE COMPOST ###")
  val eval4 = new Eval()

  var literal1 = new Literal(1)
  var literal2 = new Literal(2)
  var literal3 = new Literal(3)

  val add2 = new Add(literal1, literal2)
  val add3 = new Add(literal3, add2)
  add2.accept(eval4)
  add3.accept(eval4)
  print(add3.print() + " = ")
  println(eval4.result())
  println("Height: " + eval4.height())

}