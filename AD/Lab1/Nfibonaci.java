import java.util.*;

public class Nfibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a);
        for (int i = 0; i < n; i++) {
            b = a + b;
            a = b - a;
            System.out.print("," +a);

        }
    }

}
