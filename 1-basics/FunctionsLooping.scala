import scala.io.StdIn.{readLine}

// Previously, we wrote code inside `object Hello extends App { // code here}
// But there's another way to write, using main function as follows
object FunctionsLooping {
  def main(args: Array[String]) {
    var i = 0
    
    // while loop
    while(i <= 10) {
      println(i)
      i += 1
    }

    // do-while loop
    do {
      println(i)
      i += 1
    } while(i <= 20)

    // for loops - basic for loop
    for(i <- 1 to 10)
      println(i)
    
    // for loop - variant
    val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for(i <- 0 until randLetters.length)
      println(randLetters(i)) // note that we are using parenthesis () instead of brackets [] to refer to a randLetters character

    // Using another variant of for loop
    // Creating a List
    val aList = List(1,2,3,4,5)
    for(element <- aList) { // almost like forEach loop
      println("List Item: " + element)
    }

    // if we want to cycle through the list and only store even numbers
    var evenList = for {i <- 1 to 20 if (i % 2) == 0} yield i
    for(i <- evenList)
      println(i)
    
    // this is a nested for loop: for every value of 'i', 'j' will go from 6 to 10
    for(i <- 1 to 5; j <- 6 to 10)
      println("i: " + i, " j: " + j)

    // In scala, there are no break/continue statement
    // But instead, we can use a function as follows:
    def printPrimes() {
      val primeList = List(1,2,3,4,5,6,7,8,9,10,11)
      for(i <- primeList) {
        // simulation of a break statement can be returning on a condition
        if(i == 11) return

        // simulation of a continue statement can be to conditionally put something, and if the condition is not satisfied, then that should just continue the loop
        if(i != 1)
          println(i) // if i != 1, then this line is executed, otherwise, the loop continues
      }
    }

    // to execute a function, no need to call it with parenthesis
    printPrimes // this is a function call for printPrimes
    printPrimes() // this is also a function call for printPrimes

    var numberGuess = 0
    do {
      println("Guess a number")
      // readLine is imported from scala.io.StdIn.{readLine}
      numberGuess = readLine.toInt // take input from command line
      // for other data types: readInt, readLong, readDouble, readByte, readShort, etc.
      // readLine is for reading strings. Read as strings and convert as shown in L65
    } while(numberGuess != 15)

    // we can use printf() same as used in C
    printf("You guessed the secret number %d\n", numberGuess)

    val name = "Sriram"
    val age = 25
    val weight = 92
    println(s"Hello $name") // another way to use println
    println(f"I am ${age + 1} and weigh $weight%.2f") // $weight%.2f means floating number with 2 decimal places
    // in f-strings and printf, we can use %c for characters,
    // %d - Int; %f - Float/Double; %s - String

    // Right justify 10 with 5 spaces
    printf("'%5d'\n", 10) // '    10'

    // Left justify 10 with 5 spaces
    printf("'%-5d'\n", 10) // '10    '

    // Right justify 5 with 5 spaces and fill spaces with 0's
    printf("'%05d'\n", 5) // '00005'

    // if we want 5 decimal places
    printf("'%.5f'\n", 3.14) // '3.14000'

    // we can also left/right justify strings as well
    printf("'%-5s'\n", "hi") // 'hi    ' // %-5s => left justify

    // escape sequences for some special key strokes:
    // \b for backspace; \\ for '\'; \a for audio-alert; etc;
  }
}

// OUTPUT

// 0
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// 11
// 12
// 13
// 14
// 15
// 16
// 17
// 18
// 19
// 20
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// A
// B
// C
// D
// E
// F
// G
// H
// I
// J
// K
// L
// M
// N
// O
// P
// Q
// R
// S
// T
// U
// V
// W
// X
// Y
// Z
// List Item: 1
// List Item: 2
// List Item: 3
// List Item: 4
// List Item: 5
// 2
// 4
// 6
// 8
// 10
// 12
// 14
// 16
// 18
// 20
// (i: 1, j: 6)
// (i: 1, j: 7)
// (i: 1, j: 8)
// (i: 1, j: 9)
// (i: 1, j: 10)
// (i: 2, j: 6)
// (i: 2, j: 7)
// (i: 2, j: 8)
// (i: 2, j: 9)
// (i: 2, j: 10)
// (i: 3, j: 6)
// (i: 3, j: 7)
// (i: 3, j: 8)
// (i: 3, j: 9)
// (i: 3, j: 10)
// (i: 4, j: 6)
// (i: 4, j: 7)
// (i: 4, j: 8)
// (i: 4, j: 9)
// (i: 4, j: 10)
// (i: 5, j: 6)
// (i: 5, j: 7)
// (i: 5, j: 8)
// (i: 5, j: 9)
// (i: 5, j: 10)
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// Guess a number
// 10
// Guess a number
// 11
// Guess a number
// 12
// Guess a number
// 13
// Guess a number
// 14
// Guess a number
// 15
// You guessed the secret number 15
// Hello Sriram
// I am 26 and weigh 92.00
// '   10'
// '10   '
// '00005'
// '3.14000'
// 'hi   '
