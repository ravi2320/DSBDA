object EvenNumber
{
	def main(args: Array[String])
	{
		println("Enter a number : ");
		val num = scala.io.StdIn.readInt();
		if(num % 2 == 0)
		{
			println("Given number is Even");
		}
		else
		{
			println("Given number is Odd");
		}
	}
}