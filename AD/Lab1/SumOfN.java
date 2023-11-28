public class SumOfN {
    public static void main(String[] args) {
        int array[] = { 80, 54, 19, 74, 65 };
        sum(array);
    }

    static void sum(int array[]) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum);

    }

}
