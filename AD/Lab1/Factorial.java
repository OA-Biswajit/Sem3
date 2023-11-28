public class Factorial {
    public static void main(String[] args) {
        int num = 12;
        int fact = 1;
        for (int i = 0; i <num; i++) {
            if (num == 0 || num == -1) 
                break;

            fact *= num - i;
            System.out.println(num-i);

        }
        System.out.println(fact);
    }

}
