class Exception4
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		int[] arr = {1,5,465,52,24};
		
		try{
			System.out.println("try starts");
			arr[100];
			System.out.println("try ends");
		}
		catch(NullPointerException e)
		{
			System.out.println("NPE handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("AIOOBE handled");
		}
		catch(ClassCastException e)
		{
			System.out.pirntln("CCE handled");
		}
		System.out.println("Main Ends");
	}
}