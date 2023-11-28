public class Finding_first_repeated_element_in_arr {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 4, 5, 6, 7,2};
        checkReapeat(arr);
    }
    static void checkReapeat(int arr[]){
        for (int i=0;i<arr.length;i++){
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i]==arr[j]) {
                System.out.println("Element repeated at index : "+ j);
                return;
            }
            
        }
        }
        System.out.println("Element repetition not found");
    }
    
}
