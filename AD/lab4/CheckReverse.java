public class CheckReverse {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 5, 4, 3, 2, 1 };
        // int[] arr3 = { 1, 2, 3, 4, 6 };
        System.out.println(isReverseArray(arr1, arr2)); // should print true
        // System.out.println(isReverseArray(arr1, arr3)); // should print false
    }

    static boolean isReverseArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        int len = arr1.length;
        for (int i = 0; i < len; i++) {
            if (arr1[i] != arr2[len - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
