// import package.sub.subsub._  -> `._` means the same as `.*` in java

import scala.math._ // import always at the top level

object Hello extends App {
  println(10 + 3 * 5 / 2) // res0: Int = 17 (in REPL)
  var res = 10 + 3 * 5 / 2 // res is a variable 'var' to create a variable
  println("Your answer " + res)
  var myName = "Ram" // this is mutable since it is a variable -- myName: String = Ram (the type is automatically inferred)
  val myAge = 26 // this is immutable, since it is a value, created using 'val' -- myAge: Int = 40

  myName = "Sriram"

  // myAge = "100" // error: reassignment to val
  
  println(myName, myAge) // (Sriram,26)

  // this is a comment
  /**
    * This is a multi-
    * line
    * comment
    */
  
  /**
    * Data Types and their ranges
    * All data types in Scala are objects and they include
    * (Get the max value with MaxValue)
    * Byte : -128 to 127
    * Boolean : true or false
    * Char : unsigned max value 65535
    * Short : -32768 to 32767
    * Int : -2147483648 to 2147483647
    * Long : -9223372036854775808 to 9223372036854775807
    * Float : -3.4028235E38 to 3.4028235E38
    * Double : -1.7976931348623157E308 to 1.7976931348623157E308
    */

  val numDouble = 1.999999999999999 // Double has a max 15 digit precision
  print(numDouble)

  // we can create BigInteger in scala
  val largePrime = BigInt("99128374918237490128374091823470192837407132409871230948712309847123094871029347") // scala.math.BigInt = 99128374918237490128374091823470192837407132409871230948712309847123094871029347
  println(largePrime, largePrime + 1)

  val largePi = BigDecimal("3.14159265358979323846264338327950288419716939937510") // mkString() --> same as JS join()
  println(largePi + 0.00000000000000000000000000000000000000000000000001)

  var randInt = 100000 // `randInt.` (tab key in REPL) and we'll see all of the methods that can be applied to the object

  randInt += 1 // randInt++ is NOT allowed
  randInt -= 1 // In the same way, randInt-- is also not allowed

  randInt /= 4 // shorthand notation
  randInt *= 4

  println(randInt)

  // import scala.math._ // this is legal
  
  println("abs(-2330): " + abs(-2330)) // 2330 (Int)
  println("cbrt(27): " + cbrt(27)) // 3.0 (Double)
  println("ceil(5.45): " + ceil(5.45)) // 6.0 (Double)
  println("round(5.45): " + round(5.45)) // 5 (Long)
  println("round(5.5): " + round(5.5)) // 6 (Long)
  println("floor(5.45): " + floor(5.45)) // 5.0 (Double)
  println("exp(1): " + exp(1)) // 2.718281828459045 (Double) <- this is Euler's Number 'e'
  println("pow(2,2): " + pow(2,2)) // 4.0 (Double)
  println("sqrt(pow(2,2) + pow(2,2)): " + sqrt(pow(2,2) + pow(2,2))) // 2.8284271247461903 (Double)
  println("hypot(2,2): " + hypot(2,2)) // 2.8284271247461903 (Double)
  println("log10(1000): " + log10(1000)) // 3.0 (Double)
  println("log(2.718281828459045): " + log(2.718281828459045)) // 1.0 (Double) <- This is natural log i.e., log base 'e'
  println("min(5, 10): " + min(5, 10)) // 5 (Int)
  println("max(1, 1000): " + max(1, 1000)) // 1000 (Int)
  println(random) // 0.0 to 0.99 (Double)
  println((random * (11 - 1) + 1).toInt) // Generates a random Int between 1 & 10
  println("toRadians(90): " + toRadians(90)) // 1.5707963267948966 (Double)
  println("toDegrees(1.5707963267948966): " + toDegrees(1.5707963267948966)) // 90.0 (Double)

  /**
    * Conditional Operators: ==, !=, <, >, <=, >=
    * Logical Operators: && || !
    */
  
  // ternary operator
  var age = 5
  val canVote = if (age >= 18) "yes" else "no" // highly readable, compared to `(predicate) ? (true) : (false)`
  
  // if-else statements
  // For single line statements, braces are NOT needed
  if (age >= 5 && age <= 6)
    println("Go to kindergarten")
  else if (age > 6 && age <= 7)
    println("Go to grade 1")
  else println("Go to grade " + (age - 5))

  println(true || false) // true
  println(false || false) // false
  println(true & false) // false
  println(true | false) // true
}
