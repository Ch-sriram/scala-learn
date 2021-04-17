object Strings {
  def main(args: Array[String]) {
    var randomSentence = "I saw a dragon fly by"

    // print the 3rd index of the string
    println("3rd index of randomSentence: " + randomSentence(3)) // a

    // Get the string length
    println(f"Length of randomSentence: ${randomSentence.length}")

    // concatenate strings
    println(randomSentence.concat(" and explode"))
    println(randomSentence + " and explode")

    // compare strings
    var str = "I saw a dragon"
    println("Are strings equal?: " + str.equals(randomSentence)) // "Are strings equal?: false"

    // substring index search
    println("'dragon' starts at index: " + randomSentence.indexOf("dragon")) // 8

    // convert string to array
    val randSentArr = randomSentence.toArray

    // cycle through the converted array
    for (v <- randSentArr)
      print(v + " ")
  }
}

// OUTPUT

// 3rd index of randomSentence: a
// Length of randomSentence: 21
// I saw a dragon fly by and explode
// I saw a dragon fly by and explode
// Are strings equal?: false
// 'dragon' starts at index: 8
// I   s a w   a   d r a g o n   f l y   b y
