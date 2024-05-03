object EvenNumber
{
	def main(args: Array[String]):Unit={
	
		println("Enter a number : ")
		val num = scala.io.StdIn.readInt()

		if(num % 2 == 0)
		{
			println("Given Number is Even")
		}
		else
		{
			println("Given Number is Odd")
		}
	}

	main(Array())
}