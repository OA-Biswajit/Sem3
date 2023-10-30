import java.util.*;

public class MaxandMin {

	public static void main(String[] args) {
		int array[]= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hello world");
		
		int max=array[0];
		int SecMax=array[0];
		
		int min=array[0];
		int SecMin=array[0];
		
		int temp[]=new int[array.length];
		Arrays.sort(array);
		
	
			
			for (int i = 0; i < array.length; i++) {
				if(i%2!=0)
			temp[i]=array[i];
			 temp[i]=array[array.length-i-1];
		System.out.println(temp[i]);
				}
	
	}
	
	

}
