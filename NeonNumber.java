import java.util.Scanner;

class NeonNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int  num = sc.nextInt();  //9
        int square = num * num; // (81), (8)
        int sum = 0; // 1] 1
            // (81 > 0),  (8 > 0) , (0 > 0 )-->condition is false
        while(square > 0 )
        {
            int rem = square % 10 ; // (81 % 10 = 1) ,(8 % 10 = 8 )
            sum += rem ; // (0 + 1 = 1), (1 + 8 = 9)
            square = square / 10 ; // (81/10 = 8), (8 / 10 = 0)
        }

        if(sum == num)
        {
            System.out.println(num+" is Neon Number.");
        }
        else {
            System.out.println(num+" is not Neon Number.");
        }
    }
}