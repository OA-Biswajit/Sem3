import java.util.Arrays;

public class minDiffPair {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 4, 3, 2, 7, 8, 9, 0 };
        Arrays.sort(arr);
        minDifference(arr);
    }

    static void minDifference(int arr[]) {
        int minDiff = Integer.MAX_VALUE;
        int diff = 0;
        int numI = -1;
        int numJ = -1;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (i!=j) {
                diff = arr[j] - arr[i];
                numI = arr[j];    
                }
                
                if (diff < minDiff) {
                    minDiff = diff;
                    numI = arr[i];
                }
            }
        }
        System.out.println(numJ + "-" + numI + "=" + minDiff);
    }
}