package video14;
public class BinarySearch {
     // Binary Search Algorithum for the Accending order Array
     public static void main(String[] args) {
          int[] SortedArray = { 0, 4, 5, 6, 7, 8, 9 };
          int target = 7;
          int index = BinaryS(SortedArray, target);
          System.out.println(index);
     }

     static int BinaryS(int[] Arr, int goal) {
          int end = Arr.length - 1;
          int start = 0;
          while (start <= end) {
               int mid = start + (end - start / 2);

               if (goal == Arr[mid]) {
                    return mid;
               } else if (goal < Arr[mid]) {
                    end = mid - 1;
               } else if (goal > Arr[mid]) {
                    start = end + 1;
               }
          }
          return -1;
     }
}
