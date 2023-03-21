import java.util.Scanner;

class StringPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String name");
		String s = sc.nextLine();
		String rev = "" ;

	/*	for (int i = 0; i <= s.length()-1; i++)
		{
			rev = s.charAt(i) + rev;
		}  */
		for (int i = s.length()-1; i >= 0; i--)
		{
			rev += s.charAt(i);
		}
		System.out.println(rev);

		if (s.equals(rev))
		{
			System.out.println("It is Palindrome String");
		}
		else {
			System.out.println("It is not Palindrome String");
		}
	}
}
