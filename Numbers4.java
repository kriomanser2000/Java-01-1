import java.util.Scanner;

public class Numbers4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num of the range: ");
        int start = scanner.nextInt();
        System.out.println("Enter second num of the range: ");
        int end = scanner.nextInt();
        int min = Math.min(start, end);
        int max = Math.max(start, end);
        for (int i = min; i <= max; i++)
        {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 1; j <= 10; j++)
            {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}