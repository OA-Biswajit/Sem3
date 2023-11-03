package Lab6;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int key = 10;
        System.out.println("Element found at index " + Search(arr, key));
    }

    static int Search(int arr[], int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int m = left + (right - left) / 2;

            if (arr[m] == key)
                return m;

            if (arr[m] < key)
                left = m + 1;

            else
                right = m - 1;
        }

        return -1;
    }

}
