import java.util.Scanner;
class String3
{
	//Write a program to check whether the given string of index.
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the string");
		String s = sc.next();

		System.out.println("enter any index value");
		int i = sc.nextInt();

		System.out.println(s.length());
		System.out.println(s.charAt(i));
	}
}
