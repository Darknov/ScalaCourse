package lectures.par1basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)
  // + - * / & | << >> >>>

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  // Instructions vs Expressions

  // IF expression
  val aCondition = true
  val aConfitionedValue = if(aCondition) 5 else 3
  println(aConfitionedValue)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }
  // NEVER WRITE THIS AGAIN

  // EVERYTHING in Scala is an Expression

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
}
