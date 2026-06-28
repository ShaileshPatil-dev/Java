package video13;

public class test {
     public static void main(String[] args) {
          int[] arr = { 11, 15, 14, 62, 13, 86, 117, 21, 39, 14, 28, 15, 17, 55, 445, 747, 44 };
          int target = 17;

          int ans = LinearSearch(arr, target);
          System.out.println("ans : " + ans);
     }

     static int LinearSearch(int[] Arr, int goal) {

          if (Arr.length == 0) {
               return -1;
          }

          for (int i = 0; i < Arr.length; i++) {
               if (Arr[i] == goal) {
                    return i;
               }
          }

          // Target not found
          return -1;
     }
}