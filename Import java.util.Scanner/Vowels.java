import java.util.Scanner;

class Vowels
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);

		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||
			ch=='u')
		{
			System.out.println(ch+ " is a vowel");
		}
		else 
		{
			System.out.println(ch+" is not a vowel");
		}
	}
}