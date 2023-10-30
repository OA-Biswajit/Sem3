
public class bubblesort 
{
    public static void BubbleSort(int arr[]){
        int a= arr.length;
for (int i=0;i<a;i++)
{
	
for (int j=0;j<a-1;j++)
{
    if(arr[j]>arr[j+1])
    {
    int temp=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
        }
    }
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
        int arr[]={5,4,2,8,9,12,4,12,1,35,98};
        BubbleSort(arr);
        print(arr);
    }
}