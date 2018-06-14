package lectures.par1basics

object ValuesVariablesTypes extends App{
  val x: Int = 42
  println(x)

  val aString: String = "hello"
  println(aString)

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 4534534534454534534L
  val aFloat: Float = 2.0f
  val aDouble: Double = 2.0

  // variables
  var aVariable: Int = 4

  aVariable = 5 // side effects
}
