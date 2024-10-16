import java.util.Scanner;

public class Numbers2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 6-digit num: ");
        String num = scan.nextLine();
        if (num.length() != 6)
        {
            System.out.println("Invalid number");
        }
        else
        {
            String editNum = num.charAt(5) +
                    "" + num.charAt(4) +
                    "" + num.charAt(2) +
                    "" + num.charAt(3) +
                    "" + num.charAt(1) +
                    "" + num.charAt(0);
            System.out.println("Modif num is: " + editNum);
        }
    }
}