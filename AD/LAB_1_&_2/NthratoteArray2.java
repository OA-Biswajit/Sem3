import java.util.*;

public class NthratoteArray2 {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        int end = array.length - 1;
        int n = 2;

        Rotate(n, end, array);

    }

    static void Rotate(int start, int end, int array[]) {
        int temp[] = new int[array.length];
        int idx = 0;

        for (int i = 0; i < array.length; i++) {
            if (start <= end)
                temp[i] = array[start++];
            else
                temp[i] = array[idx++];
        }
        System.out.println(Arrays.toString(temp));
    }
}
