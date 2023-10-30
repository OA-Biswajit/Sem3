public class SelectionSort {
    public static void Selectionsort(int arr[]){
        int n= arr.length;
        for(int i=0;i<n-1;i++)
        {
            int MinPos=i;
            for (int j =i+1; j <n; j++) {
                if(arr[MinPos] > arr[j])
                {
                    MinPos=j;
                }                
            }
            int temp=arr[MinPos];
            arr[MinPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
        public static void main(String[] args){
            int arr[]={2,4,8,6,7,6,3,1,5,9};
            System.out.println("Array before sorting");
print(arr);
Selectionsort(arr);
System.out.println("array after selection sort");
print(arr);        
}
    }
