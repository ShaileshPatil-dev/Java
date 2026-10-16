package video28;

public class SortedArr {
     public static void main(String[] args) {
          int[] arr = { 2, 4, 5, 6, 7, 8, 9 };
          System.out.println(isSorted(arr, 0));
     }

     static boolean isSorted(int[] arr, int index) {
          // base condition
          if (index == arr.length - 1) {
               return true;
          }
          return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
     }
}
