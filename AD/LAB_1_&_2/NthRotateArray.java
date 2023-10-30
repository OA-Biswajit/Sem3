import java.util.*;

public class NthRotateArray {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        int end = array.length - 1;
        int n = 2;

        System.out.println("before");
        System.out.println(Arrays.toString(array));

        Rotate(0, n-1, array);
        Rotate(n, end, array);
        Rotate(0, end, array);
    }

    static void Rotate(int start, int end, int array[]) {

        int temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.println("after");
        System.out.println(Arrays.toString(array));
    }
}
