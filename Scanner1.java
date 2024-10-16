import java.util.Scanner;

public class Scanner1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double baseNum = scanner.nextDouble();
        System.out.println("Enter second number percentage to calculate: ");
        double percen = scanner.nextDouble();
        double result = (baseNum*percen) / 100;
        System.out.println(percen + "% of " + baseNum + " = " + result);
    }
}