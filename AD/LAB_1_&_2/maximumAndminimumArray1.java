import java.util.Arrays;

public class maximumAndminimumArray1 {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        Arrays.sort(array);
        MinMaxArr(array);
    }

    static void MinMaxArr(int array[]) {

        int start = 0;
        int end = array.length - 1;
        int temp[] = new int[array.length];
        int i = -1;
            while(i++ != array.length-1) {
                if (i % 2 == 0)
                    temp[i] = array[start++];

                else
                    temp[i] = array[end--];
            }
            
        System.out.println(Arrays.toString(temp));
    }

}