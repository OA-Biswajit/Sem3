
public class largest_sum_contigious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//int array []= {-2,-3,4,-1,-2,1,5,-3};

//int array []= {1,-2,3,4,-4,6,-4,3,2};
int array []= {-8,-3,-4,-4,-6,-4,-3,-2};


int currentSum=array[0];
int prevSum=0;



			for (int i = 0; i < array.length; i++) {
				currentSum +=array[i];
				if(currentSum<0) {
					currentSum=0;	
				}
				if(prevSum<currentSum) {
					prevSum =currentSum;
				}
				
			}	


						//If array is negative
if(prevSum==0) {
	currentSum=array[0];
for (int i = 1; i < array.length; i++) {
	if(currentSum<array[i]) {
		currentSum=array[i];
	}
}
prevSum=currentSum;
}

System.out.println(prevSum);


}
}
