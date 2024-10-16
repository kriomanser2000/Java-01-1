import java.util.Scanner;

public class Numbers1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second num: ");
        int secondNum = scanner.nextInt();
        System.out.println("Enter third num: ");
        int thirdNum = scanner.nextInt();
        String result = "" + firstNum + secondNum + thirdNum;
        System.out.println(result);
    }
}
