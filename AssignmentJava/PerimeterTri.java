import java.util.Scanner;
class PerimeterTri
{
	public static void main(String[] ags)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("first side of triangle");
		int s1 = sc.nextInt();
		System.out.println("Second side of triangle");
		int s2 = sc.nextInt();
		System.out.println("Third side of triangle");
		int s3 = sc.nextInt();
		int result=s1+s2+s3;

		System.out.println("Perimeter: "+result);

	}
}
