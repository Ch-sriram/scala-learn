object Functions {
  def main(args: Array[String]) {
    // Function Syntax
    // def funcName (param1: dataType, param2: dataType): returnType = { // we can use = operator to assign to a function, or just braces
    //   function body
    //   return valueToReturn // we can also omit the `return` keyword to return just the value
    // }
    
    // function with default values
    def getSum1(num1: Int = 1, num2: Int = 1): Int = {
      return num1 + num2
    }

    // In scala, for a function body, last line of the body 
    // will be automatically picked up as a return statement, 
    // iff, an actual return statement is missing

    // Or, getSum1 can also be written in the foll. way
    def getSum2(num1: Int = 1, num2: Int = 1): Int = num1 + num2 // this automatically returns `num1 + num2`

    println("5 + 4 = " + getSum1(5, 4))
    println("10 + 20 = " + getSum2(10, 20))

    // we can also call the getSum1/getSum2 functions with named arguments as follows:
    println("100 + 200 = " + getSum2(num2 = 200, num1 = 100))
    println(s"5 + 5 = ${getSum1(num2 = 5, num1 = 5)}")

    // there are functions that do not return values, and they're called Procedures in Scala
    // A function that doesn't return anything is a Procedure, and so it returns a Unit type data type
    def sayHi(): Unit = println("Hi how are you")
    sayHi // this is the call for sayHi() function

    // a function can receive variable number of arguments as follows:
    def getSumInf(args: Int*): Int = args.reduce(_+_)
    println(getSumInf(1,2,3,4))
  }
}
