class PEvenELements
{
	public static void main(String[] args)
	{
		int[] arr = {2,4,3,7,5,4,7,8,6,5,43,34,6,46,};

		for (int i = arr.length-1; i >= 0 ; i--)
		{
			if (arr[i] % 2 == 0)
			{
				System.out.print(+arr[i]+" ");
			}
		}
	}
}