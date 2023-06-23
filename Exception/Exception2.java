class Exception2
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		int[] arr = {1,2,3,4,5};

		try{
			System.out.println("try starts");
			System.out.println(arr[100]);
			System.out.println("try ends");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("AIOOBE Handled");
		}
		System.out.println("Main Ends");
	}
}