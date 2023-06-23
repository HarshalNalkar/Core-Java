class ArithameticException
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		int a = 10 ;
		int b = 0 ;
		
		try
		{
			System.out.println(a/b);
		}
		catch (ArithmeticException e)
		{
			System.out.println("ArithmeticException Handled");
		}
		System.out.println("Main Ends");
	}
}