class AvgEvenOdd
{
	public static void main(String[] args)
	{
		int sumE = 0, sumO = 0, countE = 0, countO = 0;
		int[] arr = {3,3,43,43,23,4,6,7,89,9,6,33,34,55,6,7,88};

		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0)
			{
				sumE += arr[i];
				countE++;
			}
			else {
				sumO += arr[i];
				countO++;
			}
		}
		System.out.println("Average of EVEN elemnts: "+(sumE/countE));
		System.out.println("Average of ODD elemnts: "+(sumO/countO));
	}
}