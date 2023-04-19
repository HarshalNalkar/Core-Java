class PallEvenIndex
{
	public static void main(String [] args)
	{
		int[] arr = {2,4,3,43,5,44,3,25,46,45,7,86,4,2,5,34,7};

		for (int i = 0; i < arr.length; i++)
		{
			if (i % 2 == 0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}