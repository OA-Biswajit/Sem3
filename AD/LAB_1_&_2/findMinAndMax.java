public class findMinAndMax {
   public static void main(String[] args) {
      int array[] = { 80, 54, 19, 74, 65 };
      find(array);
   }

   static void find(int array[]) {
      int min = array[0], max = array[0];
      for (int i = 1; i < array.length; i++) {
         if (min > array[i])
            min = array[i];
         else if (max < array[i])
            max = array[i];
      }
      System.out.println("Minimum number is::" + min + " Maximum number is::" + max);
   }

}
