public class finding_how_many_repeated_pair_present {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 3, 4, 5, 6, 7, 2, 2, 8, 7, 9, 3, 4 };

        for (int i = 0; i < arr.length; i++) {
            checkReapeat(arr, arr[i], i);
        }
    }

    static void checkReapeat(int arr[], int key, int i) {
        int count = 0;

        for (int j = i + 1; j < arr.length; j++) {
            if (key == arr[j]) {
                count++;
            }

        }

        if (count != 0) {
            System.out.println("Number  of times " + key + " repeated: " + count);
        }
    }

}
