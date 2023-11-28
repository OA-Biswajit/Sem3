/**
 * LargestSumContigious
 */
public class LargestSumContigious {

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int[] arr = { -2, -3, -4, -1, -2, -1, -5, -3 };
        System.out.println("Largest Sum Contigious: " + largestSumContigious(arr));
    }

    static int largestSumContigious(int[] arr) {
        int max = Integer.MIN_VALUE;
        int currMax = 0;

        for (int i = 0; i < arr.length; i++) {
            currMax += arr[i];
            if (currMax < arr[i]) {
                currMax = arr[i];

            }
            if (max < currMax) {
                max = currMax;
            }
        }
        

        return max;
    }
}