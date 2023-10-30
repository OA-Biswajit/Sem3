public class zigzag {
    public static void main(String[] args) {
        int array[][] = { { 1, 3, 4, 11 },
                { 2, 4, 4, 6 },
                { 3, 13, 23, 3 },
                { 1, 4, 3, 4 }

        };
        System.err.print("Error:: code Incomplete");

        System.out.println(array[0][0]);

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (i >= 0 && i <= 3 && j >= 0 && j <= 3) {
                    System.out.println(array[i][j]);
                    if (i++ <= 3 && j-- >= 0) {
                        i++;
                        j--;
                    } else if (i-- >= 0 && j++ <= 3) {
                        i--;
                        j++;
                    }

                }
            }
        }

    }
}
