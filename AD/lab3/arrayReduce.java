package lab3;
import java.util.Arrays;

/**
 * arrayReduce
 */
public class arrayReduce {

    public static void main(String[] args) {
        int[] arr = { 22, 21, 23, 15, 16 };
        System.out.println("Original array" + Arrays.toString(arr));
        Arrays.sort(arr);
        ReduceFun(arr);
    }

    static void ReduceFun(int[] arr) {
        int count = 0;
        int r = arr[0];
        // each time
        for (int i = 0; i < arr.length; i++) {

            // if reducing element is possible

            if (arr[i] > 0) {
                r = arr[i];

                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] > 0) {
                        arr[j] = arr[j] - r;
                    }
                }
                count++;
                System.out.println(Arrays.toString(arr));
                System.out.println("Count of elements in the array : " + count);
            }

            // reducing element
            // for (int j = 0; j < arr.length; j++) {
            // if (arr[j] > 0) {
            // arr[j] = arr[j] - r;
            // }
            // }

        }
    }
}