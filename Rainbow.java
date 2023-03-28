import java.util.Scanner;
import java.util.Arrays;
class Rainbow
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many colors in rainbow");
        int num = sc.nextInt();
        System.out.println("Enter colors name of the rainbow");
        String[] color = new String[num];
        for (int i = 0 ; i < color.length ; i++)
        {
            color[i] = sc.next();
        } 
        System.out.println(Arrays.toString(color));
        for (int i = 0; i < color.length; i++)
        {
            System.out.println(color[i].charAt(0)+",");
        }
    }
}