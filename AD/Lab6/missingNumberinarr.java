import java.util.Arrays;

public class missingNumberinarr {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -7, 6, 8, 1, -10, 15 };
        int start = 0;
        int end = arr.length - 1;
        System.out.println(MissingNumber(arr, start, end));
    }

    static int MissingNumber(int arr[], int start, int end) {
        Arrays.sort(arr);
        int num = 1;
        for (int i = start; i <= end; i++) {
            if (arr[i] == num) {
                num++;
            }

        }

        return num;
    }
}
