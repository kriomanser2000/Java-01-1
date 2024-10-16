import java.util.Scanner;

public class MConvert
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter meter count: ");
        double m = scanner.nextDouble();
        System.out.println("What to convert to?: ");
        System.out.println("1 - Miles");
        System.out.println("2 - Inches");
        System.out.println("3 - Yards");
        int choice = scanner.nextInt();
        double miInM = 0.000621371;
        double incInM = 39.3701;
        double yaInM = 1.09361;
        switch(choice)
        {
            case 1:
                double mile = m*miInM;
                System.out.println(m + " meter is " + mile + " miles");
                break;
            case 2:
                double inch = m*incInM;
                System.out.println(m + " meter is " + inch + " inches");
                break;
            case 3:
                double yard = m*yaInM;
                System.out.println(m + " meter is " + yard + " inches");
                break;
                default:
                    System.out.println("ERROR");
        }
    }
}