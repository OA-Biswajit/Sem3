import java.util.Arrays;

public class smallestPositiveMissingNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -7, 6, 8, 1, -10, 15 };
        System.out.println(MissingNumber(arr));
    }

    static int MissingNumber(int arr[]) {
        Arrays.sort(arr);
        int num = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == num) {
                num++;
    }
    
}
        
        return num;
}
}
