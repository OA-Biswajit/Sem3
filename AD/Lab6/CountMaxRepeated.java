public class CountMaxRepeated {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 3, 5, 3, 9, 1, 30, 3, 6, 5 };

        MaxReapeat(arr);

    }

    static void MaxReapeat(int arr[]) {

        int maxCount = -1;
        int count = 0;
        int element = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (maxCount < count) {
                maxCount = count;
                count = 0;
                element = arr[i];
            }

        }
        System.out.println("Element " + element + " repeated maximum time " + maxCount);
    }
}