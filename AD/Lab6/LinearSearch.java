
public class LinearSearch {
    public static void main(String[] args) {
     
    int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
    int key=7;
    Search(arr,key);   
    }
    static void Search(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index "+i);
                break;
            }
        }
        System.out.println("Element not found");
    }
}
