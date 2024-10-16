import java.util.Scanner;

public class MonthPrint
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month num: ");
        int month = scanner.nextInt();
        if (month == 1 || month == 2 || month == 12)
        {
            System.out.println("Winter");
        }
        else if (month >= 3 && month <= 5)
        {
            System.out.println("Spring");
        }
        else if (month >= 6 && month <= 8)
        {
            System.out.println("Summer");
        }
        else if (month >= 9 && month <= 12)
        {
            System.out.println("Autumn");
        }
        else
        {
            System.out.println("ERROR");
        }
    }
}