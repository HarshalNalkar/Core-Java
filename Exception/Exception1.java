class NotValidException extends Exception
{
	public String getMessage() {
		return "Not a valid string";
	}
}
class Exception1
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		String s = "hellos";
		if (s.equals("hello"))
		{
			System.out.println("it is valid");
		}
		else {
			try
			{
				throw new NotValidException();
			}
			catch (NotValidException e)
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Main Ends");
	}
}