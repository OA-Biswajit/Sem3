import java.util.*;
public class nthFibo {

	public static void main(String[] args) {
		int a=0,b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
		 System.out.print(a+" ");
		 b=a+b;
		 a=b-a;
		}

	}

}
