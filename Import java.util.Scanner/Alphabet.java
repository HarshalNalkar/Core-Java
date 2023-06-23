import java.util.Scanner;

class Alphabet
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the alphabet");
		char ch = sc.next().charAt(0);

		if( (ch >= 65 && ch<=90) || (ch>=97 && ch<=122))
		{
			System.out.println(ch+ " is a Alphabet");
		}
		else 
		{
			System.out.println(ch+ " is not Alphabet");
		}
		

	}
}