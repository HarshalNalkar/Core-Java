import java.util.Scanner;

class AvgNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number");
		int num = sc.nextInt(), sum=0;

		for(int i = 1 ; i <= num ; i++)
		{
			int input = sc.nextInt();
			sum += input;
		}
		int res = sum / num;
		System.out.println("Averge : " +res);
	}		
}