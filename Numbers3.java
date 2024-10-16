import java.util.Scanner;

public class Numbers3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second num: ");
        int num2 = scanner.nextInt();
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);
        System.out.println("Odd nums between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i);
            }
        }
    }
}