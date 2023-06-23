import java.util.Scanner ;
class ArithmeticException1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
        System.out.println("Enter the Second number");
		int num2 = sc.nextInt();

        try {
            System.out.println(num1/num2);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticExeption Handled");
            e.printStackTrace();
        }
	}
}