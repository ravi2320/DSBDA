object greaterNumber {
  def main(args: Array[String]): Unit = {
    print("Enter two numbers : \n")

    val num1 = scala.io.StdIn.readInt()
    val num2 = scala.io.StdIn.readInt()

    if (num1 > num2) {
      println("Number1 is greater")
    } else {
      println("Number2 is greater")
    }
  }

  // Automatically execute main method when loaded
  main(Array())
}
