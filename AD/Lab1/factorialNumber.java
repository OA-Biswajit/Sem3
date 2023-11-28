
public class factorialNumber {

    public static void main(String[] args) {
        fact(12);
    }

    static int fact(int num) {
        if (num <= 0)
            return 1;
        return num * fact(num - 1);
   }
}