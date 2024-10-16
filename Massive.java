import java.util.Random;
import java.util.Scanner;

public class Massive
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array[i] = rand.nextInt(101) - 50;
        }
        int min = array[0];
        int max = array[0];
        int negatCount = 0;
        int positCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < min)
            {
                min = array[i];
            }
            if (array[i] > max)
            {
                max = array[i];
            }
            if (array[i] < 0)
            {
                negatCount++;
            }
            else if (array[i] > 0)
            {
                positCount++;
            }
            else
            {
                zeroCount++;
            }
        }
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
        System.out.println("Num of negative val: " + negatCount);
        System.out.println("Num of positive val: " + positCount);
        System.out.println("Num of zeros: " + zeroCount);
    }
}