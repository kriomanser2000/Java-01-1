import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Massives1
{
    public static void main(String[] args)
    {
        int[] array = new int[20];
        Random random = new Random();
        for(int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(101) - 50;
        }
        List<Integer> evenNums = new ArrayList<>();
        List<Integer> oddNums = new ArrayList<>();
        List<Integer> negativeNums = new ArrayList<>();
        List<Integer> positiveNums = new ArrayList<>();
        for (int num : array)
        {
            if (num % 2 == 0)
            {
                evenNums.add(num);
            }
            else
            {
                oddNums.add(num);
            }
            if (num < 0)
            {
                negativeNums.add(num);
            }
            else if (num > 0)
            {
                positiveNums.add(num);
            }
        }
        System.out.println("Orig Array: ");
        for(int num : array)
        {
            System.out.println(num + " ");
        }
        System.out.println();
        System.out.println("Even nums: " + evenNums);
        System.out.println("Odd nums: " + oddNums);
        System.out.println("Negative nums: " + negativeNums);
        System.out.println("Positive nums: " + positiveNums);
    }
}