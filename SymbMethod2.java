import java.util.Scanner;
import java.util.Arrays;

public class SymbMethod2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Want to sort aray in ascending - A, or descending - D, order?: ");
        char order = scanner.next().charAt(0);
        if (order == 'A' || order == 'a')
        {
            sortArray(arr, true);
            System.out.println("Array sorted in ascending order: " + Arrays.toString(arr));
        }
        else
        {
            System.out.println("ERROR.");
        }
    }
    public static void sortArray(int[] arr, boolean asc)
    {
        Arrays.sort(arr);
        if(!asc)
        {
            int n = arr.length;
            for(int i = 0; i < n / 2; i++)
            {
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            }
        }
    }
}