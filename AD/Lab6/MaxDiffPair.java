import java.util.Arrays;

public class MaxDiffPair {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 4, 3, 2, 7, 8, 9, 0 };
        Arrays.sort(arr);
        maxDifference(arr);
    }

    static void maxDifference(int arr[]) {
        int maxDiff = Integer.MIN_VALUE;
        int diff = 0;
        int numI = -1;
        int numJ = -1;
        for (int i = 0; i < arr.length; i++) {
            numI = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (i != j) {
                    diff = arr[j] - arr[i];
                    numI = arr[j];
                    
                }
            if (diff > maxDiff) {
                maxDiff = diff;
                
            }
            }
        }
        System.out.println(numJ + "-" + numI + "=" + maxDiff);
    }
}