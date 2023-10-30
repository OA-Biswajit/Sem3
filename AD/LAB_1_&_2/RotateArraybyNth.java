import java.util.Scanner;

public class RotateArraybyNth {
	public static void main(String[] args) {
		int array[]= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		int temp[]=new int [n/2];
		int b=n-(n/2)+1;
		int temp2[]=new int [b];
		
		for(int i=0;i<array.length;i++) {
			temp[i]=array[i];

		}
		for (int i = 0; i < array.length; i++) {
			temp2[i]=array[n+i];
		}
	 temp  =	Rotate(n/2,temp);
	 temp2 = Rotate(b,temp2);
	 
	 for (int i = 0; i < array.length; i++) {
array[i]=temp[i];
array[i]=temp2[i];


	}
	 
	 for (int i = 0; i <= array.length; i++) {
		System.out.println(array[i]);
		}
	}
	
	static int[] Rotate(int n, int array[]) {
		
		for(int i=0;i<n;i++) {
			int temp=array[i];
			array[i]=array[n-i-1];
			array[n-i-1]=temp;
		}
		return array;
	}
	
}
