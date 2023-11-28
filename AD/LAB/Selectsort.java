import java.util.Arrays;

public class Selectsort
{

    public static void main(String[] args)
    {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr)
{
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }
            if (minIndex != i) 
            {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}